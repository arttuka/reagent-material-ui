(ns reagent-mui.icons.stacked-bar-chart-rounded
  "Imports @mui/icons-material/StackedBarChartRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stacked-bar-chart-rounded (create-svg-icon (e "path" #js {"d" "M6 20c1.1 0 2-.9 2-2V9H4v9c0 1.1.9 2 2 2zM4 8h4V6c0-1.1-.9-2-2-2s-2 .9-2 2v2zm6 3h4V9c0-1.1-.9-2-2-2s-2 .9-2 2v2zm6 1v2h4v-2c0-1.1-.9-2-2-2s-2 .9-2 2zm2 8c1.1 0 2-.9 2-2v-3h-4v3c0 1.1.9 2 2 2zm-6 0c1.1 0 2-.9 2-2v-6h-4v6c0 1.1.9 2 2 2z"})
                                                "StackedBarChartRounded"))
