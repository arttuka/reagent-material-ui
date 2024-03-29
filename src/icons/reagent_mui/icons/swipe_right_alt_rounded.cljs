(ns reagent-mui.icons.swipe-right-alt-rounded
  "Imports @mui/icons-material/SwipeRightAltRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swipe-right-alt-rounded (create-svg-icon (e "path" #js {"d" "M13.9 11c-.46-2.28-2.48-4-4.9-4-2.76 0-5 2.24-5 5s2.24 5 5 5c2.42 0 4.44-1.72 4.9-4h4.27l-.88.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l2.59-2.59c.39-.39.39-1.02 0-1.41L18.7 8.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.88.89H13.9z"})
                                              "SwipeRightAltRounded"))
