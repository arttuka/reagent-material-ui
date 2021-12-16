(ns reagent-mui.icons.keyboard-double-arrow-down
  "Imports @mui/icons-material/KeyboardDoubleArrowDown as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-double-arrow-down (create-svg-icon [(e "path" #js {"d" "M18 6.41 16.59 5 12 9.58 7.41 5 6 6.41l6 6z"}) (e "path" #js {"d" "m18 13-1.41-1.41L12 16.17l-4.59-4.58L6 13l6 6z"})]
                                                 "KeyboardDoubleArrowDown"))
