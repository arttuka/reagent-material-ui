(ns reagent-mui.icons.call-missed-outgoing
  "Imports @mui/icons-material/CallMissedOutgoing as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def call-missed-outgoing (create-svg-icon (e "path" #js {"d" "m3 8.41 9 9 7-7V15h2V7h-8v2h4.59L12 14.59 4.41 7 3 8.41z"})
                                           "CallMissedOutgoing"))
