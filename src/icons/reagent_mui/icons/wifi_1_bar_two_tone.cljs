(ns reagent-mui.icons.wifi-1-bar-two-tone
  "Imports @mui/icons-material/Wifi1BarTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wifi-1-bar-two-tone (create-svg-icon (e "path" #js {"d" "M15.53 17.46 12 21l-3.53-3.54c.9-.9 2.15-1.46 3.53-1.46s2.63.56 3.53 1.46z"})
                                          "Wifi1BarTwoTone"))
