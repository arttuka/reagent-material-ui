(ns reagent-mui.icons.pivot-table-chart-sharp
  "Imports @mui/icons-material/PivotTableChartSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pivot-table-chart-sharp (create-svg-icon (e "path" #js {"d" "M10 3h11v5H10zm-7 7h5v11H3zm0-7h5v5H3zm15 6-4 4h3v4h-4v-3l-4 4 4 4v-3h6v-6h3z"})
                                              "PivotTableChartSharp"))
