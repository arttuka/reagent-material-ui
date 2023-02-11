(ns reagent-mui.icons.bar-chart-sharp
  "Imports @mui/icons-material/BarChartSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bar-chart-sharp (create-svg-icon (e "path" #js {"d" "M4 9h4v11H4zm12 4h4v7h-4zm-6-9h4v16h-4z"})
                                      "BarChartSharp"))
