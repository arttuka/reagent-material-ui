(ns reagent-material-ui.icons.call-missed-outgoing
  "Imports @material-ui/icons/CallMissedOutgoing as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-missed-outgoing (create-svg-icon (e "path" #js {"d" "m3 8.41 9 9 7-7V15h2V7h-8v2h4.59L12 14.59 4.41 7 3 8.41z"})
                                           "CallMissedOutgoing"))
