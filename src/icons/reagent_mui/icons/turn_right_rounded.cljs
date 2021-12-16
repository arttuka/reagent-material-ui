(ns reagent-mui.icons.turn-right-rounded
  "Imports @mui/icons-material/TurnRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-right-rounded (create-svg-icon (e "path" #js {"d" "M16.29 13.29c.39.39 1.02.39 1.41 0l2.59-2.59c.39-.39.39-1.02 0-1.41L17.7 6.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.88.89H9c-1.1 0-2 .9-2 2v8c0 .55.45 1 1 1s1-.45 1-1v-8h8.17l-.88.88c-.39.39-.39 1.02 0 1.41z"})
                                         "TurnRightRounded"))
