(ns reagent-material-ui.icons.scatter-plot-rounded
  "Imports @material-ui/icons/ScatterPlotRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def scatter-plot-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "14", "r" "3", "cx" "7"}) (e "circle" #js {"cy" "6", "r" "3", "cx" "11"}) (e "circle" #js {"cy" "17.6", "r" "3", "cx" "16.6"}))
                                           "ScatterPlotRounded"))
