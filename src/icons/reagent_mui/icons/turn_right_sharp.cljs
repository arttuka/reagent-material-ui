(ns reagent-mui.icons.turn-right-sharp
  "Imports @mui/icons-material/TurnRightSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-right-sharp (create-svg-icon (e "path" #js {"d" "m17.17 11-1.58 1.59L17 14l4-4-4-4-1.41 1.41L17.17 9H7v11h2v-9z"})
                                       "TurnRightSharp"))
