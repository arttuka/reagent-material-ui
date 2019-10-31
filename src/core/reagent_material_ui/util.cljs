(ns reagent-material-ui.util
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent.core :as r]
            [reagent.impl.util :refer [fun-name]]
            [clojure.string :as str]
            [clojure.walk :refer [postwalk]]
            [camel-snake-kebab.core :refer [->kebab-case-keyword ->camelCaseString]]
            [cljsjs.react]
            [material-ui]
            [goog.object :as obj]))

(defn adapt-react-class
  ([c]
   (adapt-react-class c (fun-name c)))
  ([c display-name]
   (let [adapted (r/adapt-react-class c)]
     (set! (.-displayName adapted) display-name)
     adapted)))

(def ^:private color-key? #{:A100 :A200 :A400 :A700 "A100" "A200" "A400" "A700"})
(defn ^:private numeric-string? [s]
  (and (string? s)
       (some? (re-matches #"[0-9]+" s))))

(defn ^:private key->str [k]
  (let [n (name k)]
    (cond
      (color-key? k) n
      (str/starts-with? n "data-") n
      (str/starts-with? n "aria-") n
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

(defn js->clj' [obj]
  (convert-map-keys (js->clj obj) (fn [k]
                                    (cond
                                      (color-key? k) (keyword k)
                                      (numeric-string? k) (js/parseInt k)
                                      :else (->kebab-case-keyword k)))))

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
                                                               (merge {:ref      ref
                                                                       :children (obj/get props "children")}))]
                                             (r/as-element [component clj-props]))))]
    (set! (.-displayName reactified) (fun-name component))
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

(defn create-svg-icon [path display-name]
  (let [component (->> (fn [props ref]
                         (e (.-SvgIcon js/MaterialUI) (.assign js/Object #js {:ref ref} props) path))
                       (.forwardRef js/React)
                       (.memo js/React))]
    (adapt-react-class component display-name)))
