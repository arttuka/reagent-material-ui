(ns reagent-material-ui.icons.call-missed-two-tone
  "Imports @material-ui/icons/CallMissedTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-missed-two-tone (create-svg-icon (e "path" #js {"d" "M5 10.41l7 7 9-9L19.59 7 12 14.59 6.41 9H11V7H3v8h2z"})
                                           "CallMissedTwoTone"))
