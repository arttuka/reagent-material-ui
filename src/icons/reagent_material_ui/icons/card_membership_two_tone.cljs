(ns reagent-material-ui.icons.card-membership-two-tone
  "Imports @material-ui/icons/CardMembershipTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def card-membership-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 4h16v6H4zm0 9h16v2H4z", "opacity" ".3"}) (e "path" #js {"d" "M20 2H4c-1.11 0-2 .89-2 2v11c0 1.11.89 2 2 2h4v5l4-2 4 2v-5h4c1.11 0 2-.89 2-2V4c0-1.11-.89-2-2-2zm0 13H4v-2h16v2zm0-5H4V4h16v6z"}))
                                               "CardMembershipTwoTone"))
