(ns reagent-mui.icons.turn-sharp-right-rounded
  "Imports @mui/icons-material/TurnSharpRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-sharp-right-rounded (create-svg-icon (e "path" #js {"d" "m16 6.83-.88.88c-.39.39-1.02.39-1.41 0a.9959.9959 0 0 1 0-1.41l2.59-2.59c.39-.39 1.02-.39 1.41 0L20.3 6.3c.39.39.39 1.02 0 1.41-.39.39-1.02.39-1.41 0L18 6.83V13c0 1.1-.9 2-2 2H8v5c0 .55-.45 1-1 1s-1-.45-1-1v-5c0-1.1.9-2 2-2h8V6.83z"})
                                               "TurnSharpRightRounded"))
