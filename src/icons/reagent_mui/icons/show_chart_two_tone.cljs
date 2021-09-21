(ns reagent-mui.icons.show-chart-two-tone
  "Imports @mui/icons-material/ShowChartTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def show-chart-two-tone (create-svg-icon (e "path" #js {"d" "m13.5 13.48-4-4L2 16.99l1.5 1.5 6-6.01 4 4L22 6.92l-1.41-1.41z"})
                                          "ShowChartTwoTone"))
