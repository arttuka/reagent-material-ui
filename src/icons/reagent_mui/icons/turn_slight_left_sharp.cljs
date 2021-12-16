(ns reagent-mui.icons.turn-slight-left-sharp
  "Imports @mui/icons-material/TurnSlightLeftSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-slight-left-sharp (create-svg-icon (e "path" #js {"d" "M11.66 6V4H6v5.66h2V7.41l5 5V20h2v-8.41L9.41 6z"})
                                             "TurnSlightLeftSharp"))
