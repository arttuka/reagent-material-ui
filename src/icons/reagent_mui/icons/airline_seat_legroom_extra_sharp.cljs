(ns reagent-mui.icons.airline-seat-legroom-extra-sharp
  "Imports @mui/icons-material/AirlineSeatLegroomExtraSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def airline-seat-legroom-extra-sharp (create-svg-icon (e "path" #js {"d" "M4 3H2v14h11v-2H4zm18.24 12.96-2.53 1.15-3.41-6.98C15.96 9.45 15.27 9 14.51 9H11V3H5v11h10l3.41 7 5.07-2.32-1.24-2.72z"})
                                                       "AirlineSeatLegroomExtraSharp"))
