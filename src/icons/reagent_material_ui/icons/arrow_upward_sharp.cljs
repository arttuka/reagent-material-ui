(ns reagent-material-ui.icons.arrow-upward-sharp
  "Imports @material-ui/icons/ArrowUpwardSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-upward-sharp (create-svg-icon (e "path" #js {"d" "M4 12l1.41 1.41L11 7.83V20h2V7.83l5.58 5.59L20 12l-8-8-8 8z"})
                                         "ArrowUpwardSharp"))
