(ns reagent-mui.icons.keyboard-arrow-down
  "Imports @mui/icons-material/KeyboardArrowDown as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-arrow-down (create-svg-icon (e "path" #js {"d" "M7.41 8.59 12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z"})
                                          "KeyboardArrowDown"))
