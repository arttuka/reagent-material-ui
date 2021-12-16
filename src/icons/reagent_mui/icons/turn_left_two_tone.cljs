(ns reagent-mui.icons.turn-left-two-tone
  "Imports @mui/icons-material/TurnLeftTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-left-two-tone (create-svg-icon (e "path" #js {"d" "m6.83 11 1.59 1.59L7 14l-4-4 4-4 1.41 1.41L6.83 9H15c1.1 0 2 .9 2 2v9h-2v-9H6.83z"})
                                         "TurnLeftTwoTone"))
