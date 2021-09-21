(ns reagent-mui.icons.credit-card-sharp
  "Imports @mui/icons-material/CreditCardSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def credit-card-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2.01L2 20h20V4zm-2 14H4v-6h16v6zm0-10H4V6h16v2z"})
                                        "CreditCardSharp"))
