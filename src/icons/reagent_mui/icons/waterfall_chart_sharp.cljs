(ns reagent-mui.icons.waterfall-chart-sharp
  "Imports @mui/icons-material/WaterfallChartSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def waterfall-chart-sharp (create-svg-icon (e "path" #js {"d" "M18 4h3v16h-3V4zM3 13h3v7H3v-7zm11-9h3v3h-3V4zm-4 1h3v4h-3V5zm-3 5h3v4H7v-4z"})
                                            "WaterfallChartSharp"))
