(ns reagent-material-ui.icons.show-chart
  "Imports @material-ui/icons/ShowChart as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def show-chart (create-svg-icon (e "path" #js {"d" "M3.5 18.49l6-6.01 4 4L22 6.92l-1.41-1.41-7.09 7.97-4-4L2 16.99z"})
                                 "ShowChart"))
