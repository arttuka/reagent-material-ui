(ns ^:figwheel-hooks example.core
  (:require-macros [reagent-material-ui.util :refer [react-component]])
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [reagent-material-ui.cljs-time-adapter :refer [cljs-time-adapter]]
            [reagent-material-ui.colors :as colors]
            [reagent-material-ui.core.button :refer [button]]
            [reagent-material-ui.core.chip :refer [chip]]
            [reagent-material-ui.core.css-baseline :refer [css-baseline]]
            [reagent-material-ui.core.input-adornment :refer [input-adornment]]
            [reagent-material-ui.core.menu-item :refer [menu-item]]
            [reagent-material-ui.core.stack :refer [stack]]
            [reagent-material-ui.core.styled-engine-provider :refer [styled-engine-provider]]
            [reagent-material-ui.core.text-field :refer [text-field]]
            [reagent-material-ui.core.toolbar :refer [toolbar]]
            [reagent-material-ui.icons.add-box :refer [add-box]]
            [reagent-material-ui.icons.clear :refer [clear]]
            [reagent-material-ui.icons.face :refer [face]]
            [reagent-material-ui.icons.face-outlined :refer [face-outlined]]
            [reagent-material-ui.lab.date-picker :refer [date-picker]]
            [reagent-material-ui.lab.localization-provider :refer [localization-provider]]
            [reagent-material-ui.styles :as styles]
            [example.autocomplete :refer [autocomplete]])
  (:import (goog.i18n DateTimeSymbols_en_US)))

(set! *warn-on-infer* true)

(defn event-value
  [e]
  (.. e -target -value))

;; Example

(def custom-theme
  {:palette {:primary   colors/purple
             :secondary colors/green}})

(defn custom-styles [{:keys [spacing] :as theme}]
  {:container  {:margin-left (spacing 8)
                :align-items :flex-start}
   :button     {:margin (spacing 1)}
   :text-field {:width        200
                :margin-left  (spacing 1)
                :margin-right (spacing 1)}})

(def with-custom-styles (styles/with-styles custom-styles))

(defonce text-state (r/atom "foobar"))
(defonce select-state (r/atom 1))
(defonce date-picker-state (r/atom nil))
(defonce autocomplete-state (r/atom nil))

(defn form* [{:keys [classes] :as props}]
  [stack {:direction "column"
          :spacing   2
          :class     (:container classes)}

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


   [date-picker {:value        @date-picker-state
                 :render-input (react-component [props]
                                 [text-field props])
                 :on-change    (fn [value]
                                 (reset! date-picker-state value))
                 :input-format "MM/dd/yyyy"
                 :label        "Date picker"}]
   [autocomplete {:class     (:text-field classes)
                  :value     @autocomplete-state
                  :on-change (fn [new-value]
                               (reset! autocomplete-state new-value))}]])

(def form (with-custom-styles form*))

(defn main []
  ;; fragment
  [:<>
   [css-baseline]
   ;; localization-provider provides date handling utils to date and time pickers.
   ;; cljs-time-adapter is a date adapter that allows you to use cljs-time / goog.date date objects.
   ;; styled-engine-provider is needed to ensure correct order of CSS injection until Material UI has completely migrated to emotion
   [localization-provider {:date-adapter cljs-time-adapter
                           :locale       DateTimeSymbols_en_US}
    [styles/theme-provider (styles/create-mui-theme custom-theme)
     [styled-engine-provider {:inject-first true}
      [form]]]]])

(defn ^{:after-load true, :dev/after-load true}
  mount []
  (rdom/render [main] (js/document.getElementById "app")))

(defn ^:export init []
  (mount))
