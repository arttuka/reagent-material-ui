(ns reagent-material-ui.util
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent.core :as r]
            [clojure.string :as str]
            [clojure.walk :refer [postwalk]]
            [camel-snake-kebab.core :refer [->kebab-case-keyword ->camelCaseString]]
            [cljsjs.react]
            [material-ui]
            [goog.object :as obj]))

(defn component-name [component]
  (when-let [name (or (.-displayName component) (.-name component))]
    (str/replace name "$" "__")))

(defn adapt-react-class
  ([c]
   (adapt-react-class c (component-name c)))
  ([c display-name]
   (let [adapted (r/adapt-react-class c)]
     (set! (.-displayName adapted) display-name)
     adapted)))

(def ^:private color-key? #{:A100 :A200 :A400 :A700 "A100" "A200" "A400" "A700"})
(defn ^:private numeric-string? [s]
  (and (string? s)
       (some? (re-matches #"[0-9]+" s))))

(defn clj->js' [obj]
  (clj->js obj :keyword-fn (fn [k]
                             (cond
                               (color-key? k) (name k)
                               (number? k) k
                               :else (->camelCaseString k)))))

(defn js->clj' [obj]
  (postwalk (fn [x]
              (if (map-entry? x)
                (let [[k v] x]
                  [(cond
                     (color-key? k) (keyword k)
                     (numeric-string? k) (js/parseInt k)
                     :else (->kebab-case-keyword k))
                   v])
                x))
            (js->clj obj)))

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

(defn reactify-component [component]
  (let [reactified (.forwardRef js/React (fn [props ref]
                                           (let [clj-props (-> (js->clj' props)
                                                               (dissoc :children)
                                                               (assoc :ref ref
                                                                      :children (or (obj/get props "children") [])))]
                                             (r/as-element [component clj-props]))))]
    (set! (.-displayName reactified) (component-name component))
    reactified))

(defn wrap-jss-styles [styles]
  (if (fn? styles)
    (fn [theme]
      (-> (js->clj' theme)
          (styles)
          (wrap-all-clj-functions)
          (clj->js')))
    (clj->js (wrap-all-clj-functions styles))))

(defn apply-hoc [hoc component]
  (-> component
      (reactify-component)
      (hoc)
      (adapt-react-class)))

(def ^:private svg-icon (.-SvgIcon js/MaterialUI))

(defn create-svg-icon [path display-name]
  (let [component (->> (fn [props ref]
                         (e svg-icon (.assign js/Object #js {:ref ref} props) path))
                       (.forwardRef js/React)
                       (.memo js/React))]
    (adapt-react-class component display-name)))
