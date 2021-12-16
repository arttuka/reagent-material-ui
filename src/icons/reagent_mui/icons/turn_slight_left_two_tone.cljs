(ns reagent-mui.icons.turn-slight-left-two-tone
  "Imports @mui/icons-material/TurnSlightLeftTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-slight-left-two-tone (create-svg-icon (e "path" #js {"d" "M11.66 6V4H6v5.66h2V7.41l5 5V20h2v-7.58c0-.53-.21-1.04-.59-1.41l-5-5h2.25z"})
                                                "TurnSlightLeftTwoTone"))
