(ns reagent-material-ui.icons.card-membership-sharp
  "Imports @material-ui/icons/CardMembershipSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def card-membership-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v15h6v5l4-2 4 2v-5h6V2zm-2 13H4v-2h16v2zm0-5H4V4h16v6z"})
                                            "CardMembershipSharp"))
