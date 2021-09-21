(ns reagent-mui.icons.park-sharp
  "Imports @mui/icons-material/ParkSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def park-sharp (create-svg-icon (e "path" #js {"d" "M17 12h2L12 2 5.05 12H7l-3.9 6h6.92v4h3.96v-4H21z"})
                                 "ParkSharp"))
