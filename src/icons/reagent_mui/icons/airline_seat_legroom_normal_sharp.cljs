(ns reagent-mui.icons.airline-seat-legroom-normal-sharp
  "Imports @mui/icons-material/AirlineSeatLegroomNormalSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def airline-seat-legroom-normal-sharp (create-svg-icon (e "path" #js {"d" "M5 15V3H3v14h11v-2H5zm17 3h-3v-7c0-1.1-.9-2-2-2h-5V3H6v11h10v7h6v-3z"})
                                                        "AirlineSeatLegroomNormalSharp"))
