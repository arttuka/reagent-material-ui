(ns reagent-mui.icons.keyboard-arrow-left-two-tone
  "Imports @mui/icons-material/KeyboardArrowLeftTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-arrow-left-two-tone (create-svg-icon (e "path" #js {"d" "M15.41 16.59 10.83 12l4.58-4.59L14 6l-6 6 6 6 1.41-1.41z"})
                                                   "KeyboardArrowLeftTwoTone"))
