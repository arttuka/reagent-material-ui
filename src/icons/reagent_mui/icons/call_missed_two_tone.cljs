(ns reagent-mui.icons.call-missed-two-tone
  "Imports @mui/icons-material/CallMissedTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def call-missed-two-tone (create-svg-icon (e "path" #js {"d" "m5 10.41 7 7 9-9L19.59 7 12 14.59 6.41 9H11V7H3v8h2z"})
                                           "CallMissedTwoTone"))
