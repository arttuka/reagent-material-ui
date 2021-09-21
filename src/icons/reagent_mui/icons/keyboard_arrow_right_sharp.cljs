(ns reagent-mui.icons.keyboard-arrow-right-sharp
  "Imports @mui/icons-material/KeyboardArrowRightSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-arrow-right-sharp (create-svg-icon (e "path" #js {"d" "M8.59 16.59 13.17 12 8.59 7.41 10 6l6 6-6 6-1.41-1.41z"})
                                                 "KeyboardArrowRightSharp"))
