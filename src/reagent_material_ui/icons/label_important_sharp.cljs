(ns reagent-material-ui.icons.label-important-sharp
  "Imports @material-ui/icons/LabelImportantSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def label-important-sharp (create-svg-icon (e "path" #js {"d" "M4 18.99h12.04L21 12l-4.97-7H4l5 7-5 6.99z"})
                                            "LabelImportantSharp"))
