(ns reagent-mui.icons.credit-score-sharp
  "Imports @mui/icons-material/CreditScoreSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def credit-score-sharp (create-svg-icon (e "path" #js {"d" "M2 4v16h7v-2H4v-6h18V4H2zm18 4H4V6h16v2zm-5.07 11.17-2.83-2.83-1.41 1.41L14.93 22 22 14.93l-1.41-1.41-5.66 5.65z"})
                                         "CreditScoreSharp"))
