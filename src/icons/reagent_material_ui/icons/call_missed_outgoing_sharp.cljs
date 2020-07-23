(ns reagent-material-ui.icons.call-missed-outgoing-sharp
  "Imports @material-ui/icons/CallMissedOutgoingSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-missed-outgoing-sharp (create-svg-icon (e "path" #js {"d" "M3 8.41l9 9 7-7V15h2V7h-8v2h4.59L12 14.59 4.41 7 3 8.41z"})
                                                 "CallMissedOutgoingSharp"))
