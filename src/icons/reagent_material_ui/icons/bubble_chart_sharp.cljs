(ns reagent-material-ui.icons.bubble-chart-sharp
  "Imports @material-ui/icons/BubbleChartSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def bubble-chart-sharp (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "14.4", "r" "3.2", "cx" "7.2"}) (e "circle" #js {"cy" "18", "r" "2", "cx" "14.8"}) (e "circle" #js {"cy" "8.8", "r" "4.8", "cx" "15.2"}))
                                         "BubbleChartSharp"))
