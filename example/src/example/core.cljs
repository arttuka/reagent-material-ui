(ns example.core
  (:require [reagent.core :as r]
            [reagent-material-ui.cljs-time-utils :refer [cljs-time-utils]]
            [reagent-material-ui.components :as mui]
            [reagent-material-ui.colors :as colors]
            [reagent-material-ui.icons.add-box :refer [add-box]]
            [reagent-material-ui.icons.clear :refer [clear]]
            [reagent-material-ui.icons.face :refer [face]]
            [reagent-material-ui.pickers :as pickers]
            [reagent-material-ui.styles :as styles])
  (:import (goog.i18n DateTimeSymbols_en_US)))

(set! *warn-on-infer* true)

(defn event-value
  [^js/Event e]
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
  [mui/grid
   {:container true
    :direction "column"
    :spacing   2}

   [mui/grid {:item true}
    [mui/toolbar
     {:disable-gutters true}
     [mui/button
      {:variant  "contained"
       :color    "primary"
       :class    (:button classes)
       :on-click #(swap! text-state str " foo")}
      "Update value property"
      [add-box]]

     [mui/button
      {:variant  "outlined"
       :color    "secondary"
       :class    (:button classes)
       :on-click #(reset! text-state "")}
      "Reset"
      [clear]]]]

   [mui/grid {:item true}
    [mui/text-field
     {:value       @text-state
      :label       "Text input"
      :placeholder "Placeholder"
      :helper-text "Helper text"
      :class       (:text-field classes)
      :on-change   (fn [e]
                     (reset! text-state (event-value e)))
      :inputRef    #(js/console.log "input-ref" %)}]]

   [mui/grid {:item true}
    [mui/text-field
     {:value       @text-state
      :label       "Textarea"
      :placeholder "Placeholder"
      :helper-text "Helper text"
      :class       (:text-field classes)
      :on-change   (fn [e]
                     (reset! text-state (event-value e)))
      :multiline   true
      :rows        10}]]

   [mui/grid {:item true}
    [mui/text-field
     {:value       @text-state
      :label       "Select"
      :placeholder "Placeholder"
      :helper-text "Helper text"
      :class       (:text-field classes)
      :on-change   (fn [e]
                     (reset! text-state (event-value e)))
      :select      true}
     [mui/menu-item
      {:value 1}
      "Item 1"]
     [mui/menu-item
      {:value 2}
      "Item 2"]]]

   [mui/grid {:item true}
    ;; For properties that require React Node as parameter,
    ;; use r/as-element to convert Reagent hiccup forms into React elements,
    ;; or use r/create-element to directly instantiate element from React class (i.e. non-adapted React component).
    [mui/grid {:item true}
     [mui/chip
      {:icon  (r/as-element [face])
       :label "Icon element example, r/as-element"}]]]

   [mui/grid {:item true}
    [pickers/date-picker {:value       @date-picker-state
                          :on-change   (fn [value]
                                         (reset! date-picker-state value))
                          :format      "MM/dd/yyyy"
                          :placeholder "Select a date"
                          :helper-text "Helper text"
                          :auto-ok     true}]]])

(defn main []
  ;; fragment
  [:<>
   [mui/css-baseline]
   ;; mui-pickers-utils-provider provides date handling utils to date and time pickers.
   ;; cljs-time-utils is an utility package that allows you to use cljs-time / goog.date date objects.
   [pickers/mui-pickers-utils-provider {:utils  cljs-time-utils
                                        :locale DateTimeSymbols_en_US}
    [styles/theme-provider (styles/create-mui-theme custom-theme)
     [mui/grid
      {:container true
       :direction "row"
       :justify   "center"}
      [mui/grid
       {:item true
        :xs   6}
       [(with-custom-styles form)]]]]]])

(defn start []
  (r/render [main] (js/document.getElementById "app")))

(start)
