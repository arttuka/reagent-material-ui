(ns reagent-mui.icons.local-hospital-sharp
  "Imports @mui/icons-material/LocalHospitalSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-hospital-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3.01L3 21h18V3zm-3 11h-4v4h-4v-4H6v-4h4V6h4v4h4v4z"})
                                           "LocalHospitalSharp"))
