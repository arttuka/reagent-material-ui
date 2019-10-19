(ns reagent-material-ui.icons.arrow-downward
  "Imports @material-ui/icons/ArrowDownward as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-downward (create-svg-icon (e "path" #js {"d" "M20 12l-1.41-1.41L13 16.17V4h-2v12.17l-5.58-5.59L4 12l8 8 8-8z"})
                                     "ArrowDownward"))
