(ns reagent-material-ui.icons.format-color-fill-rounded
  "Imports @material-ui/icons/FormatColorFillRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-color-fill-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M16.56 8.94L8.32.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l1.68 1.68-5.15 5.15c-.59.59-.59 1.54 0 2.12l5.5 5.5c.29.29.68.44 1.06.44s.77-.15 1.06-.44l5.5-5.5c.59-.58.59-1.53 0-2.12zM5.21 10L10 5.21 14.79 10H5.21zM19 11.5s-2 2.17-2 3.5c0 1.1.9 2 2 2s2-.9 2-2c0-1.33-2-3.5-2-3.5z"}) (e "path" #js {"d" "M2 20h20c1.1 0 2 .9 2 2s-.9 2-2 2H2c-1.1 0-2-.9-2-2s.9-2 2-2z", "fillOpacity" ".36"}))
                                                "FormatColorFillRounded"))
