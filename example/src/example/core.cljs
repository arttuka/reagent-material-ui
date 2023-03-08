(ns ^:figwheel-hooks example.core
  (:require-macros [reagent-mui.util :refer [react-component]])
  (:require [react :as react]
            [reagent.core :as r]
            [reagent.dom.client :as rdom]
            [reagent-mui.cljs-time-adapter :refer [cljs-time-adapter]]
            [reagent-mui.colors :as colors]
            [reagent-mui.material.button :refer [button]]
            [reagent-mui.material.chip :refer [chip]]
            [reagent-mui.material.css-baseline :refer [css-baseline]]
            [reagent-mui.material.input-adornment :refer [input-adornment]]
            [reagent-mui.material.menu-item :refer [menu-item]]
            [reagent-mui.material.stack :refer [stack]]
            [reagent-mui.material.text-field :refer [text-field]]
            [reagent-mui.material.toolbar :refer [toolbar]]
            [reagent-mui.material.typography :refer [typography]]
            [reagent-mui.icons.add-box :refer [add-box]]
            [reagent-mui.icons.clear :refer [clear]]
            [reagent-mui.icons.face :refer [face]]
            [reagent-mui.icons.face-outlined :refer [face-outlined]]
            [reagent-mui.x.date-picker :refer [date-picker]]
            [reagent-mui.x.localization-provider :refer [localization-provider]]
            [reagent-mui.styles :as styles]
            [example.autocomplete :refer [autocomplete]]
            [example.select :as select]
            [example.data-grid :as data-grid]
            ["@mui/material/TextField" :as MuiTextField])
  (:import (goog.i18n DateTimeSymbols_en_US)))

(set! *warn-on-infer* true)

(defn event-value
  [e]
  (.. e -target -value))

;; Example

(def custom-theme
  {:palette {:primary   colors/purple
             :secondary colors/green}})

(def classes (let [prefix "rmui-example"]
               {:root       (str prefix "-root")
                :button     (str prefix "-button")
                :text-field (str prefix "-text-field")}))

(defn custom-styles [{:keys [theme]}]
  (let [spacing (:spacing theme)]
    {(str "&." (:root classes))        {:margin-left (spacing 8)
                                        :align-items :flex-start}
     (str "& ." (:button classes))     {:margin (spacing 1)}
     (str "& ." (:text-field classes)) {:width        200
                                        :margin-left  (spacing 1)
                                        :margin-right (spacing 1)}}))

(defonce text-state (r/atom "foobar"))
(defonce select-state (r/atom 1))
(defonce date-picker-state (r/atom nil))
(defonce autocomplete-state (r/atom nil))

(defn form* [{:keys [class-name]}]
  [stack {:direction "column"
          :spacing   2
          :class     [class-name (:root classes)]}

   [toolbar {:disable-gutters true}
    [button
     {:variant  "contained"
      :color    "primary"
      :class    (:button classes)
      :on-click #(swap! text-state str " foo")}
     "Update value property"
     [add-box]]
    [button
     {:variant  "outlined"
      :color    "secondary"
      :class    (:button classes)
      :on-click (fn []
                  (reset! text-state "")
                  (reset! select-state 1)
                  (reset! date-picker-state nil)
                  (reset! autocomplete-state nil))}
     "Reset"
     [clear]]]

   [text-field
    {:value       @text-state
     :label       "Text input"
     :placeholder "Placeholder"
     :helper-text "Helper text"
     :class       (:text-field classes)
     :on-change   (fn [e]
                    (reset! text-state (event-value e)))}]

   [text-field
    {:value       @text-state
     :label       "Text with Adornment"
     :placeholder "Placeholder"
     :helper-text "Helper text"
     :class       (:text-field classes)
     :on-change   (fn [e]
                    (reset! text-state (event-value e)))
     :InputProps  {:end-adornment (r/as-element [input-adornment {:position "end"} "Baz"])}}]

   [text-field
    {:value       @text-state
     :label       "Textarea"
     :placeholder "Placeholder"
     :helper-text "Helper text"
     :class       (:text-field classes)
     :on-change   (fn [e]
                    (reset! text-state (event-value e)))
     :multiline   true
     :rows        10}]

   [text-field
    {:id        :textarea-autosize
     :value     @text-state
     :label     "Autosized textarea"
     :class     (:text-field classes)
     :on-change (fn [e]
                  (reset! text-state (event-value e)))
     :multiline true
     :min-rows  2
     :max-rows  10}]

   [text-field
    {:value       @select-state
     :label       "Select"
     :placeholder "Placeholder"
     :helper-text "Helper text"
     :class       (:text-field classes)
     :on-change   (fn [e]
                    (reset! select-state (event-value e)))
     :select      true}
    [menu-item
     {:value 1}
     "Item 1"]
    [menu-item
     {:value 2}
     "Item 2"]]

   ;; For properties that require React Node as parameter,
   ;; use r/as-element to convert Reagent hiccup forms into React elements,
   ;; or use r/create-element to directly instantiate element from React class (i.e. non-adapted React component).
   [stack {:direction :row
           :spacing   2}
    [chip {:icon  (r/as-element [face])
           :label "Icon element example, r/as-element"}]
    [chip {:icon  (r/as-element [face-outlined])
           :label "Another example icon"}]]

   [date-picker {:value     @date-picker-state
                 :on-change (fn [value]
                              (reset! date-picker-state value))
                 :format    "MM/dd/yyyy"
                 :label     "Date picker"}]
   [autocomplete {:class     (:text-field classes)
                  :value     @autocomplete-state
                  :on-change (fn [new-value]
                               (reset! autocomplete-state new-value))}]
   [typography {:variant :h5} "Data Grid"]
   [data-grid/component]
   [stack {:direction :row
           :spacing   2}
    [:> select/component {:options [{:label "Red" :value "#D32F2F"}
                                    {:label "Blue" :value "#2196F3"}]
                          :placeholder "Select a color"}]]])

(def form (styles/styled form* custom-styles))

(defn main []
  ;; fragment
  [:<>
   [css-baseline]
   ;; localization-provider provides date handling utils to date and time pickers.
   ;; cljs-time-adapter is a date adapter that allows you to use cljs-time / goog.date date objects.
   [localization-provider {:date-adapter   cljs-time-adapter
                           :adapter-locale DateTimeSymbols_en_US}
    [styles/theme-provider (styles/create-theme custom-theme)
     [form]]]])

(defn ^{:after-load true, :dev/after-load true}
  mount []
  (let [root (rdom/create-root (js/document.getElementById "app"))]
    (rdom/render root [main])))

(defn ^:export init []
  (mount))
