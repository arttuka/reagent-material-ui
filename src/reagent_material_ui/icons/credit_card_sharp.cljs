(ns reagent-material-ui.icons.credit-card-sharp
  "Imports @material-ui/icons/CreditCardSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def credit-card-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2.01L2 20h20V4zm-2 14H4v-6h16v6zm0-10H4V6h16v2z"})
                                        "CreditCardSharp"))
