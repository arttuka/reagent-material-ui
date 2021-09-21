(ns reagent-mui.icons.show-chart
  "Imports @mui/icons-material/ShowChart as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def show-chart (create-svg-icon (e "path" #js {"d" "m3.5 18.49 6-6.01 4 4L22 6.92l-1.41-1.41-7.09 7.97-4-4L2 16.99z"})
                                 "ShowChart"))
