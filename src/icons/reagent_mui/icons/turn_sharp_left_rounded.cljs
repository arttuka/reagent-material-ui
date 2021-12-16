(ns reagent-mui.icons.turn-sharp-left-rounded
  "Imports @mui/icons-material/TurnSharpLeftRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-sharp-left-rounded (create-svg-icon (e "path" #js {"d" "m8 6.83.88.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L7.71 3.71a.9959.9959 0 0 0-1.41 0L3.71 6.29c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L6 6.83V13c0 1.1.9 2 2 2h8v5c0 .55.45 1 1 1s1-.45 1-1v-5c0-1.1-.9-2-2-2H8V6.83z"})
                                              "TurnSharpLeftRounded"))
