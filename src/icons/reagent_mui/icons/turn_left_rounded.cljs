(ns reagent-mui.icons.turn-left-rounded
  "Imports @mui/icons-material/TurnLeftRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-left-rounded (create-svg-icon (e "path" #js {"d" "M7.71 13.29c-.39.39-1.02.39-1.41 0L3.71 10.7a.9959.9959 0 0 1 0-1.41L6.3 6.7c.39-.39 1.02-.39 1.41 0 .39.39.39 1.02 0 1.41L6.83 9H15c1.1 0 2 .9 2 2v8c0 .55-.45 1-1 1s-1-.45-1-1v-8H6.83l.88.88c.39.39.39 1.02 0 1.41z"})
                                        "TurnLeftRounded"))
