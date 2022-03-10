(ns reagent-mui.icons.wifi-1-bar-rounded
  "Imports @mui/icons-material/Wifi1BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wifi-1-bar-rounded (create-svg-icon (e "circle" #js {"cx" "12", "cy" "18", "r" "2"})
                                         "Wifi1BarRounded"))
