(ns example.select
  (:require-macros [reagent-mui.util :refer [react-component]])
  (:require [reagent.core :as r]
            [reagent-mui.styles :as styles]
            [reagent-mui.base.select-unstyled-context :refer [select-unstyled-context-provider]]
            [reagent-mui.base.use-option :refer [use-option]]
            [reagent-mui.base.use-select :refer [use-select]]
            [reagent-mui.util :refer [use-effect use-ref use-state js->clj']]))

(def root (styles/styled "div" {:position "relative"}))

(def toggle (styles/styled "div" {:width            256
                                  :border           "1px solid #CDD2D7"
                                  :background-color "var(--color, white)"
                                  :padding          10
                                  :display          "inline-flex"
                                  :align-items      "center"
                                  :justify-content  "center"
                                  "& .placeholder"  {:opacity "0.8"}}))

(def listbox (styles/styled "div" {:padding    5
                                   :list-style "none"
                                   :position   "absolute"
                                   :width      "100%"
                                   :border     "1px solid #CDD2D7"
                                   :outline    0
                                   "&.hidden"  {:opacity    0
                                                :visibility "hidden"
                                                :transition "opacity 0.4s 0.5s ease, visibility 0.4s 0.5s step-end"}
                                   "& > li"    {:padding                  8
                                                "&:hover"                 {:background-color "#E7EBF0"}
                                                "&[aria-selected='true']" {:background-color "#E0E3E7"}}}))

(def option (react-component [{:keys [value children]}]
              (let [{:keys [get-root-props highlighted]} (use-option {:value    value
                                                                      :disabled false})]
                [:li.foobar (merge (js->clj' (get-root-props))
                                   {:class-name (when highlighted "highlighted")})
                 children])))

(def component (react-component [{:keys [options placeholder]}]
                 (let [listbox-ref (use-ref nil)
                       [listbox-visible? set-listbox-visible] (use-state false)
                       {:keys [get-button-props get-listbox-props context-value value]} (use-select {:listbox-ref listbox-ref
                                                                                                     :options     options})]
                   (use-effect #(do (when listbox-visible?
                                      (some-> (.-current listbox-ref) (.focus)))
                                    js/undefined)
                               #js [listbox-visible?])
                   [root {:on-mouse-over #(set-listbox-visible true)
                          :on-mouse-out  #(set-listbox-visible false)
                          :on-focus      #(set-listbox-visible true)
                          :on-blur       #(set-listbox-visible false)}
                    [toggle (merge {:style {"--color" value}}
                                   (js->clj' (get-button-props)))
                     (or value [:span.placeholder placeholder])]
                    [listbox (merge {:class-name (when-not listbox-visible? "hidden")}
                                    (js->clj' (get-listbox-props)))
                     [select-unstyled-context-provider {:value context-value}
                      (for [{:keys [value label]} options]
                        ^{:key value} [:> option {:value value}
                                       label])]]])))
