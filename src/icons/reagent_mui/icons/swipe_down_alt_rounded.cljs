(ns reagent-mui.icons.swipe-down-alt-rounded
  "Imports @mui/icons-material/SwipeDownAltRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swipe-down-alt-rounded (create-svg-icon (e "path" #js {"d" "M13 13.9c2.28-.46 4-2.48 4-4.9 0-2.76-2.24-5-5-5S7 6.24 7 9c0 2.42 1.72 4.44 4 4.9v4.27l-.88-.88a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l2.59 2.59c.39.39 1.02.39 1.41 0l2.59-2.59c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0l-.89.88V13.9z"})
                                             "SwipeDownAltRounded"))
