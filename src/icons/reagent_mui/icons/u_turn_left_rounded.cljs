(ns reagent-mui.icons.u-turn-left-rounded
  "Imports @mui/icons-material/UTurnLeftRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def u-turn-left-rounded (create-svg-icon (e "path" #js {"d" "M3.71 12.29c.39-.39 1.02-.39 1.41 0l.88.88V9c0-3.31 2.69-6 6-6s6 2.69 6 6v11c0 .55-.45 1-1 1s-1-.45-1-1V9c0-2.21-1.79-4-4-4S8 6.79 8 9v4.17l.88-.88c.39-.39 1.02-.39 1.41 0 .39.39.39 1.02 0 1.41L7.7 16.29c-.39.39-1.02.39-1.41 0L3.7 13.7c-.38-.38-.38-1.02.01-1.41z"})
                                          "UTurnLeftRounded"))
