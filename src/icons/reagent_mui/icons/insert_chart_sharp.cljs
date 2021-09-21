(ns reagent-mui.icons.insert-chart-sharp
  "Imports @mui/icons-material/InsertChartSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def insert-chart-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM9 17H7v-7h2v7zm4 0h-2V7h2v10zm4 0h-2v-4h2v4z"})
                                         "InsertChartSharp"))
