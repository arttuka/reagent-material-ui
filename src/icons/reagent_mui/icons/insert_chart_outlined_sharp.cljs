(ns reagent-mui.icons.insert-chart-outlined-sharp
  "Imports @mui/icons-material/InsertChartOutlinedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def insert-chart-outlined-sharp (create-svg-icon (e "path" #js {"d" "M9 17H7v-7h2v7zm4 0h-2V7h2v10zm4 0h-2v-4h2v4zm2 2H5V5h14v14zm2-16H3v18h18V3z"})
                                                  "InsertChartOutlinedSharp"))
