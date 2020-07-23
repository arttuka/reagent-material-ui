(ns reagent-material-ui.icons.credit-card-rounded
  "Imports @material-ui/icons/CreditCardRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def credit-card-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.11 0-1.99.89-1.99 2L2 18c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V6c0-1.11-.89-2-2-2zm-1 14H5c-.55 0-1-.45-1-1v-5h16v5c0 .55-.45 1-1 1zm1-10H4V6h16v2z"})
                                          "CreditCardRounded"))
