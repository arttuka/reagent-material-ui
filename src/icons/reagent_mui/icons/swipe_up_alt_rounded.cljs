(ns reagent-mui.icons.swipe-up-alt-rounded
  "Imports @mui/icons-material/SwipeUpAltRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swipe-up-alt-rounded (create-svg-icon (e "path" #js {"d" "m13 5.41.88.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12.7 2.29a.9959.9959 0 0 0-1.41 0L8.71 4.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l.88-.88v4.27c-2.28.46-4 2.48-4 4.9 0 2.76 2.24 5 5 5s5-2.24 5-5c0-2.42-1.72-4.44-4-4.9V5.41z"})
                                           "SwipeUpAltRounded"))
