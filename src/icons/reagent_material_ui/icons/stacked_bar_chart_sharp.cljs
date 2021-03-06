(ns reagent-material-ui.icons.stacked-bar-chart-sharp
  "Imports @material-ui/icons/StackedBarChartSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stacked-bar-chart-sharp (create-svg-icon (e "path" #js {"d" "M6 10h3v10H6V10zm0-5h3v4H6V5zm10 11h3v4h-3v-4zm0-3h3v2h-3v-2zm-5 0h3v7h-3v-7zm0-4h3v3h-3V9z"})
                                              "StackedBarChartSharp"))
