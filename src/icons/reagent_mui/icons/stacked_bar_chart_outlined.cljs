(ns reagent-mui.icons.stacked-bar-chart-outlined
  "Imports @mui/icons-material/StackedBarChartOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stacked-bar-chart-outlined (create-svg-icon (e "path" #js {"d" "M6 10h3v10H6V10zm0-5h3v4H6V5zm10 11h3v4h-3v-4zm0-3h3v2h-3v-2zm-5 0h3v7h-3v-7zm0-4h3v3h-3V9z"})
                                                 "StackedBarChartOutlined"))
