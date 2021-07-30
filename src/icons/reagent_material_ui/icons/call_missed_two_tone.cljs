(ns reagent-material-ui.icons.call-missed-two-tone
  "Imports @material-ui/icons/CallMissedTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-missed-two-tone (create-svg-icon (e "path" #js {"d" "m5 10.41 7 7 9-9L19.59 7 12 14.59 6.41 9H11V7H3v8h2z"})
                                           "CallMissedTwoTone"))
