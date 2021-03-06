(ns reagent-material-ui.icons.credit-score-sharp
  "Imports @material-ui/icons/CreditScoreSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def credit-score-sharp (create-svg-icon (e "path" #js {"d" "M2 4v16h7v-2H4v-6h18V4H2zm18 4H4V6h16v2zm-5.07 11.17l-2.83-2.83-1.41 1.41L14.93 22 22 14.93l-1.41-1.41-5.66 5.65z"})
                                         "CreditScoreSharp"))
