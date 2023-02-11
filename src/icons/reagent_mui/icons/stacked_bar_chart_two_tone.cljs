(ns reagent-mui.icons.stacked-bar-chart-two-tone
  "Imports @mui/icons-material/StackedBarChartTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stacked-bar-chart-two-tone (create-svg-icon (e "path" #js {"d" "M4 9h4v11H4zm0-5h4v4H4zm6 3h4v4h-4zm6 3h4v4h-4zm0 5h4v5h-4zm-6-3h4v8h-4z"})
                                                 "StackedBarChartTwoTone"))
