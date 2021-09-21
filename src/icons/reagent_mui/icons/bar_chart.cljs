(ns reagent-mui.icons.bar-chart
  "Imports @mui/icons-material/BarChart as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bar-chart (create-svg-icon (e "path" #js {"d" "M5 9.2h3V19H5zM10.6 5h2.8v14h-2.8zm5.6 8H19v6h-2.8z"})
                                "BarChart"))
