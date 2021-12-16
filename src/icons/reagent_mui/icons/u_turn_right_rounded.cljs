(ns reagent-mui.icons.u-turn-right-rounded
  "Imports @mui/icons-material/UTurnRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def u-turn-right-rounded (create-svg-icon (e "path" #js {"d" "M20.29 12.29a.9959.9959 0 0 0-1.41 0l-.88.88V9c0-3.31-2.69-6-6-6S6 5.69 6 9v11c0 .55.45 1 1 1s1-.45 1-1V9c0-2.21 1.79-4 4-4s4 1.79 4 4v4.17l-.88-.88a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l2.59 2.59c.39.39 1.02.39 1.41 0l2.59-2.59c.38-.38.38-1.02-.01-1.41z"})
                                           "UTurnRightRounded"))
