(ns reagent-material-ui.util
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent.core :as r]
            [clojure.walk :refer [postwalk]]
            [camel-snake-kebab.core :refer [->kebab-case]]
            [cljsjs.react]
            [goog.object :as obj]))

(defn js->clj' [obj]
  (postwalk (fn [x]
              (if (keyword? x)
                (->kebab-case x)
                x))
            (js->clj obj :keywordize-keys true)))

(defn wrap-clj-function [f]
  (fn [& args]
    (clj->js (apply f (map js->clj' args)))))

(defn wrap-js-function [f]
  (fn [& args]
    (js->clj' (apply f (map clj->js args)))))

(defn wrap-all-clj-functions [m]
  (postwalk (fn [x]
              (if (fn? x)
                (wrap-clj-function x)
                x))
            m))

(defn wrap-js-props [component]
  (fn [props]
    [component (js->clj' props)]))

(defn wrap-jss-styles [styles]
  (if (fn? styles)
    (fn [theme]
      (-> (js->clj' theme)
          (styles)
          (wrap-all-clj-functions)
          (clj->js)))
    (clj->js (wrap-all-clj-functions styles))))

(defn apply-hoc [hoc component]
  (-> (wrap-js-props component)
      (r/reactify-component)
      (hoc)
      (r/adapt-react-class)))

(defn create-svg-icon [path display-name]
  (let [svg-icon (.-SvgIcon js/MaterialUI)
        component (->> (fn [props ref]
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
