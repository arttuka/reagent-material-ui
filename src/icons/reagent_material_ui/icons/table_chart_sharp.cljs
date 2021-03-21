(ns reagent-material-ui.icons.table-chart-sharp
  "Imports @material-ui/icons/TableChartSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def table-chart-sharp (create-svg-icon (e "path" #js {"d" "M10 10.02h5V21h-5V10.02zM17 21h5V10h-5v11zm5-18H3v5h19V3zM3 21h5V10H3v11z"})
                                        "TableChartSharp"))
