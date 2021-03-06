(ns reagent-material-ui.icons.show-chart-sharp
  "Imports @material-ui/icons/ShowChartSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def show-chart-sharp (create-svg-icon (e "path" #js {"d" "M3.5 18.49l6-6.01 4 4L22 6.92l-1.41-1.41-7.09 7.97-4-4L2 16.99l1.5 1.5z"})
                                       "ShowChartSharp"))
