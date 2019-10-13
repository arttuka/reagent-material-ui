(ns reagent-material-ui.icons.label-sharp
  "Imports @material-ui/icons/LabelSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def label-sharp (create-svg-icon (e "path" #js {"d" "M17.03 5L3 5.01v13.98l14.03.01L22 12l-4.97-7z"})
                                  "LabelSharp"))
