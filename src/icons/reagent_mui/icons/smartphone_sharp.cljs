(ns reagent-mui.icons.smartphone-sharp
  "Imports @mui/icons-material/SmartphoneSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def smartphone-sharp (create-svg-icon (e "path" #js {"d" "M5 1v22h14V1H5zm12 18H7V5h10v14z"})
                                       "SmartphoneSharp"))
