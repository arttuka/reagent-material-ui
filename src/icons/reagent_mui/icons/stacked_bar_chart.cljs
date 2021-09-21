(ns reagent-mui.icons.stacked-bar-chart
  "Imports @mui/icons-material/StackedBarChart as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stacked-bar-chart (create-svg-icon (e "path" #js {"d" "M6 10h3v10H6zm0-5h3v4H6zm10 11h3v4h-3zm0-3h3v2h-3zm-5 0h3v7h-3zm0-4h3v3h-3z"})
                                        "StackedBarChart"))
