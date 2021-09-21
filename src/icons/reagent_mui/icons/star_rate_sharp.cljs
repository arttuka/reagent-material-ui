(ns reagent-mui.icons.star-rate-sharp
  "Imports @mui/icons-material/StarRateSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def star-rate-sharp (create-svg-icon (e "path" #js {"d" "M14.43 10 12 2l-2.43 8H2l6.18 4.41L5.83 22 12 17.31 18.18 22l-2.35-7.59L22 10z"})
                                      "StarRateSharp"))
