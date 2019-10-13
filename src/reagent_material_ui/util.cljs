(ns reagent-material-ui.util
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent.core :as r]
            [clojure.walk :refer [postwalk]]
            [camel-snake-kebab.core :refer [->kebab-case ->camelCaseString]]
            [cljsjs.react]
            [material-ui]
            [goog.object :as obj]))

(def ^:private color-key? #{:A100 :A200 :A400 :A700})

(defn clj->js' [obj]
  (clj->js obj :keyword-fn (fn [k]
                             (if (color-key? k)
                               (name k)
                               (->camelCaseString k)))))

(defn js->clj' [obj]
  (postwalk (fn [x]
              (cond
                (color-key? x) x
                (keyword? x) (->kebab-case x)
                :else x))
            (js->clj obj :keywordize-keys true)))

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
  (.forwardRef js/React (fn [props ref]
                          (r/as-element [component (assoc (js->clj' props)
                                                          :ref ref)]))))

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
      (r/adapt-react-class)))

(def ^:private svg-icon (.-SvgIcon js/MaterialUI))

(defn create-svg-icon [path display-name]
  (let [component (->> (fn [props ref]
                         (e svg-icon (.assign js/Object #js {:ref ref} props) path))
                       (.forwardRef js/React)
                       (.memo js/React))]
    (when (not= (some-> js/process
                        (obj/get "env")
                        (obj/get "NODE_ENV"))
                "production")
      (set! (.-displayName component) (str display-name "Icon")))
    (set! (.-muiName component) (.-muiName svg-icon))
    (r/adapt-react-class component)))
