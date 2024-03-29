(ns reagent-mui.icons.credit-card-two-tone
  "Imports @mui/icons-material/CreditCardTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def credit-card-two-tone (create-svg-icon [(e "path" #js {"d" "M4 12h16v6H4zm0-6h16v2H4z", "opacity" ".3"}) (e "path" #js {"d" "M20 4H4c-1.11 0-1.99.89-1.99 2L2 18c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V6c0-1.11-.89-2-2-2zm0 14H4v-6h16v6zm0-10H4V6h16v2z"})]
                                           "CreditCardTwoTone"))
