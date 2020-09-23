(ns reagent-material-ui.icons.stacked-line-chart
  "Imports @material-ui/icons/StackedLineChart as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stacked-line-chart (create-svg-icon (e "path" #js {"d" "M2 19.99l7.5-7.51 4 4 7.09-7.97L22 9.92l-8.5 9.56-4-4-6 6.01-1.5-1.5zm1.5-4.5l6-6.01 4 4L22 3.92l-1.41-1.41-7.09 7.97-4-4L2 13.99l1.5 1.5z"})
                                         "StackedLineChart"))
