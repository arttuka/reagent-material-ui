(ns ^:figwheel-hooks example.core
  (:require-macros [reagent-material-ui.util :refer [react-component]])
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]
            [reagent-material-ui.cljs-time-utils :refer [cljs-time-utils]]
            [reagent-material-ui.colors :as colors]
            [reagent-material-ui.core.button :refer [button]]
            [reagent-material-ui.core.chip :refer [chip]]
            [reagent-material-ui.core.css-baseline :refer [css-baseline]]
            [reagent-material-ui.core.input-adornment :refer [input-adornment]]
            [reagent-material-ui.core.grid :refer [grid]]
            [reagent-material-ui.core.menu-item :refer [menu-item]]
            [reagent-material-ui.core.text-field :refer [text-field]]
            [reagent-material-ui.core.toolbar :refer [toolbar]]
            [reagent-material-ui.icons.add-box :refer [add-box]]
            [reagent-material-ui.icons.clear :refer [clear]]
            [reagent-material-ui.icons.face :refer [face]]
            [reagent-material-ui.pickers.date-picker :refer [date-picker]]
            [reagent-material-ui.pickers.localization-provider :refer [localization-provider]]
            [reagent-material-ui.styles :as styles])
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
  {:button     {:margin (spacing 1)}
   :text-field {:width        200
                :margin-left  (spacing 1)
                :margin-right (spacing 1)}})

(def with-custom-styles (styles/with-styles custom-styles))

(defonce text-state (r/atom "foobar"))
(defonce date-picker-state (r/atom nil))

(defn form [{:keys [classes] :as props}]
  [grid
   {:container true
    :direction "column"
    :spacing   2}

   [grid {:item true}
    [toolbar
     {:disable-gutters true}
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
       :on-click #(reset! text-state "")}
      "Reset"
      [clear]]]]

   [grid {:item true}
    [text-field
     {:value       @text-state
      :label       "Text input"
      :placeholder "Placeholder"
      :helper-text "Helper text"
      :class       (:text-field classes)
      :on-change   (fn [e]
                     (reset! text-state (event-value e)))}]]

   [grid {:item true}
    [text-field
     {:value       @text-state
      :label       "Text with Adornment"
      :placeholder "Placeholder"
      :helper-text "Helper text"
      :class       (:text-field classes)
      :on-change   (fn [e]
                     (reset! text-state (event-value e)))
      :InputProps {:end-adornment (r/as-element [input-adornment {:position "end"} "Baz"])}}]]

   [grid {:item true}
    [text-field
     {:value       @text-state
      :label       "Textarea"
      :placeholder "Placeholder"
      :helper-text "Helper text"
      :class       (:text-field classes)
      :on-change   (fn [e]
                     (reset! text-state (event-value e)))
      :multiline   true
      :rows        10}]]

   [grid {:item true}
    [text-field
     {:id        :textarea-autosize
      :value     @text-state
      :label     "Autosized textarea"
      :class     (:text-field classes)
      :on-change (fn [e]
                   (reset! text-state (event-value e)))
      :multiline true
      :min-rows  2
      :max-rows  10}]]

   [grid {:item true}
    [text-field
     {:value       @text-state
      :label       "Select"
      :placeholder "Placeholder"
      :helper-text "Helper text"
      :class       (:text-field classes)
      :on-change   (fn [e]
                     (reset! text-state (event-value e)))
      :select      true}
     [menu-item
      {:value 1}
      "Item 1"]
     [menu-item
      {:value 2}
      "Item 2"]]]

   [grid {:item true}
    ;; For properties that require React Node as parameter,
    ;; use r/as-element to convert Reagent hiccup forms into React elements,
    ;; or use r/create-element to directly instantiate element from React class (i.e. non-adapted React component).
    [grid {:item true}
     [chip
      {:icon  (r/as-element [face])
       :label "Icon element example, r/as-element"}]]]

   [grid {:item true}
    [date-picker {:value        @date-picker-state
                  :render-input (react-component [props]
                                  [text-field props])
                  :on-change    (fn [value]
                                  (reset! date-picker-state value))
                  :input-format "MM/dd/yyyy"
                  :label        "Date picker"}]]])

(defn main []
  ;; fragment
  [:<>
   [css-baseline]
   ;; mui-pickers-utils-provider provides date handling utils to date and time pickers.
   ;; cljs-time-utils is an utility package that allows you to use cljs-time / goog.date date objects.
   [localization-provider {:date-adapter cljs-time-utils
                           :locale       DateTimeSymbols_en_US}
    [styles/theme-provider (styles/create-mui-theme custom-theme)
     [grid
      {:container       true
       :direction       "row"
       :justify-content "center"}
      [grid
       {:item true
        :xs   6}
       [(with-custom-styles form)]]]]]])

(defn ^{:after-load true, :dev/after-load true}
  mount []
  (rdom/render [main] (js/document.getElementById "app")))

(defn ^:export init []
  (mount))
