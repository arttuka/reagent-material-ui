(ns reagent-material-ui.icons.call-missed-outgoing-outlined
  "Imports @material-ui/icons/CallMissedOutgoingOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def call-missed-outgoing-outlined (create-svg-icon (e "path" #js {"d" "M3 8.41l9 9 7-7V15h2V7h-8v2h4.59L12 14.59 4.41 7 3 8.41z"})
                                                    "CallMissedOutgoingOutlined"))
