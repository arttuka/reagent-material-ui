(ns reagent-mui.icons.turn-left-sharp
  "Imports @mui/icons-material/TurnLeftSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-left-sharp (create-svg-icon (e "path" #js {"d" "m6.83 11 1.58 1.59L7 14l-4-4 4-4 1.41 1.41L6.83 9H17v11h-2v-9z"})
                                      "TurnLeftSharp"))
