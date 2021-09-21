(ns reagent-mui.icons.card-membership-sharp
  "Imports @mui/icons-material/CardMembershipSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def card-membership-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v15h6v5l4-2 4 2v-5h6V2zm-2 13H4v-2h16v2zm0-5H4V4h16v6z"})
                                            "CardMembershipSharp"))
