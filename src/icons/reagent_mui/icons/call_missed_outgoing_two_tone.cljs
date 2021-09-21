(ns reagent-mui.icons.call-missed-outgoing-two-tone
  "Imports @mui/icons-material/CallMissedOutgoingTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def call-missed-outgoing-two-tone (create-svg-icon (e "path" #js {"d" "M19 10.41V15h2V7h-8v2h4.59L12 14.59 4.41 7 3 8.41l9 9z"})
                                                    "CallMissedOutgoingTwoTone"))
