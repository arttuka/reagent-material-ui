(ns reagent-mui.icons.turn-right-two-tone
  "Imports @mui/icons-material/TurnRightTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-right-two-tone (create-svg-icon (e "path" #js {"d" "m17.17 11-1.59 1.59L17 14l4-4-4-4-1.41 1.41L17.17 9H9c-1.1 0-2 .9-2 2v9h2v-9h8.17z"})
                                          "TurnRightTwoTone"))
