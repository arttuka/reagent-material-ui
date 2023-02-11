(ns reagent-mui.util
  (:require-macros [reagent-mui.util :refer [e forward-ref]])
  (:require [react :as react]
            [reagent.core :as r]
            [reagent.impl.util :refer [fun-name]]
            [cljs.core :refer [MapEntry]]
            [clojure.string :as str]
            [clojure.walk :refer [postwalk]]
            [camel-snake-kebab.core :refer [->kebab-case-keyword ->camelCaseKeyword ->camelCaseString]]
            [goog.object :as obj]
            ["@mui/material/SvgIcon" :as SvgIcon]))

(def ^:private color-key? #{:A100 :A200 :A400 :A700 "A100" "A200" "A400" "A700"})
(defn ^:private numeric-string? [s]
  (and (string? s)
       (some? (re-matches #"[0-9]+" s))))
(defn ^:private pascal-case? [s]
  (and (string? s)
       (contains? #{\A \B \C \D \E \F \G \H \I \J \K \L \M \N \O \P \Q \R \S \T \U \V \W \X \Y \Z}
                  (first s))))
(defn ^:private keyword-safe? [s]
  (some? (re-matches #"[-*+!?<>='&$%#|\w]+" s)))

(defn ^:private key->str [k]
  (let [n (name k)]
    (cond
      (color-key? k) n
      (str/starts-with? n "data-") n
      (str/starts-with? n "aria-") n
      (pascal-case? n) n
      :else (->camelCaseString k))))

(defn ^:private convert-map-keys [m f]
  (postwalk (fn [x]
              (if (map-entry? x)
                [(f (key x)) (val x)]
                x))
            m))

(defn clj->js'
  [obj]
  (clj->js (convert-map-keys obj (fn [k]
                                   (if (keyword? k)
                                     (key->str k)
                                     k)))))

(defn ^:private js-key->clj [k]
  (cond
    (keyword? k) k
    (color-key? k) (keyword k)
    (numeric-string? k) (js/parseInt k)
    (keyword-safe? k) (if (pascal-case? k)
                        (keyword k)
                        (->kebab-case-keyword k))
    :else k))

(defn js->clj'
  [obj]
  (let [convert (fn convert [x]
                  (cond
                    (seq? x)
                    (doall (map convert x))

                    (map-entry? x)
                    (MapEntry. (convert (key x)) (convert (val x)) nil)

                    (coll? x)
                    (into (empty x) (map convert) x)

                    (array? x)
                    (persistent!
                     (reduce #(conj! %1 (convert %2))
                             (transient []) x))

                    (react/isValidElement x)
                    x

                    (identical? (type x) js/Object)
                    (persistent!
                     (reduce (fn [r k]
                               (if (= "ref" k)
                                 (assoc! r :ref (obj/get x k))
                                 (assoc! r (js-key->clj k) (convert (obj/get x k)))))
                             (transient {}) (js-keys x)))
                    :else x))]
    (convert obj)))

(defn wrap-clj-function [f]
  (fn [& args]
    (clj->js' (apply f (map js->clj' args)))))

(defn wrap-js-function [f]
  (fn [& args]
    (js->clj' (apply f (map clj->js' args)))))

(defn wrap-all-clj-functions [m]
  (postwalk (fn [x]
              (if (fn? x)
                (wrap-clj-function x)
                x))
            m))

(defn wrap-all-js-functions [m]
  (postwalk (fn [x]
              (if (fn? x)
                (wrap-js-function x)
                x))
            m))

(defn reactify-component [component]
  (let [reactified (forward-ref [props ref]
                     (let [clj-props (assoc (js->clj' props) :ref ref)]
                       (r/as-element [component clj-props])))]
    (set! (.-displayName reactified) (fun-name component))
    reactified))

(defn wrap-styles [styles]
  (if (fn? styles)
    (fn [theme]
      (-> (js->clj' theme)
          (styles)
          (wrap-all-clj-functions)
          (clj->js')))
    (clj->js' (wrap-all-clj-functions styles))))

(defn apply-hoc [hoc component]
  (-> component
      (reactify-component)
      (hoc)
      (r/adapt-react-class)))

(defn get-anycase
  ([m k]
   (get-anycase m k nil))
  ([m k default]
   (if-let [entry (or (find m (->kebab-case-keyword k))
                      (find m (->camelCaseKeyword k)))]
     (val entry)
     default)))

(defn assoc-anycase
  ([m k v]
   (assoc (dissoc m (->camelCaseKeyword k)) (->kebab-case-keyword k) v))
  ([m k v & kvs]
   (let [ret (assoc-anycase m k v)]
     (if kvs
       (recur ret (first kvs) (second kvs) (nnext kvs))
       ret))))

(defn remove-undefined-vals [m]
  (persistent!
   (reduce-kv (fn [acc k v]
                (if (undefined? v)
                  (dissoc! acc k)
                  acc))
              (transient m)
              m)))

(defn set-ref [ref value]
  (cond
    (fn? ref) (ref value)
    ref (set! (.-current ref) value))
  js/undefined)

(defn swap-ref [ref f & args]
  (set! (.-current ref) (apply f (.-current ref) args)))

(defn use-fork-ref [& refs]
  (react/useMemo #(when (not-every? nil? refs)
                    (fn [value]
                      (doseq [ref refs]
                        (set-ref ref value))))
                 (apply array refs)))

(defn use-callback [callback props]
  (react/useCallback callback props))

(defn use-effect [effect props]
  (react/useEffect effect props))

(defn use-layout-effect [effect]
  (react/useLayoutEffect effect))

(defn use-ref [value]
  (react/useRef value))

(defn use-state [initial-state]
  (react/useState initial-state))
