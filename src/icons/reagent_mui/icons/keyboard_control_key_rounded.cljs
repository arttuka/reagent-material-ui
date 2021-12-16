(ns reagent-mui.icons.keyboard-control-key-rounded
  "Imports @mui/icons-material/KeyboardControlKeyRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-control-key-rounded (create-svg-icon (e "path" #js {"d" "M5.71 12.71c.39.39 1.02.39 1.41 0L12 7.83l4.88 4.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12.7 5.71a.9959.9959 0 0 0-1.41 0L5.7 11.3c-.38.38-.38 1.02.01 1.41z"})
                                                   "KeyboardControlKeyRounded"))
