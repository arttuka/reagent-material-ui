(ns reagent-mui.icons.directions-off-sharp
  "Imports @mui/icons-material/DirectionsOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def directions-off-sharp (create-svg-icon (e "path" #js {"d" "m13 7.5 3.5 3.5-1.33 1.34 3.45 3.45L22.41 12 12.01 1.58l-3.8 3.8L13 10.17zM1.39 4.22l3.99 3.99L1.59 12l10.42 10.4 3.79-3.79 3.99 3.99 1.41-1.41L2.81 2.81 1.39 4.22zm8.6 8.6V15h-2v-4.18l2 2z"})
                                           "DirectionsOffSharp"))
