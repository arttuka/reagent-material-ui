(ns reagent-mui.icons.sensor-window-sharp
  "Imports @mui/icons-material/SensorWindowSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sensor-window-sharp (create-svg-icon (e "path" #js {"d" "M18 4v16H6V4h12M4 2v20h16V2H4zm3 17h10v-6H7v6zm3-9h4v1h3V5H7v6h3v-1z"})
                                          "SensorWindowSharp"))
