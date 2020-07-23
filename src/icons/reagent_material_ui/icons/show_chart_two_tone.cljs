(ns reagent-material-ui.icons.show-chart-two-tone
  "Imports @material-ui/icons/ShowChartTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def show-chart-two-tone (create-svg-icon (e "path" #js {"d" "M13.5 13.48l-4-4L2 16.99l1.5 1.5 6-6.01 4 4L22 6.92l-1.41-1.41z"})
                                          "ShowChartTwoTone"))
