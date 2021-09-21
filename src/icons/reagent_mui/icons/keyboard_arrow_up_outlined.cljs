(ns reagent-mui.icons.keyboard-arrow-up-outlined
  "Imports @mui/icons-material/KeyboardArrowUpOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-arrow-up-outlined (create-svg-icon (e "path" #js {"d" "M7.41 15.41 12 10.83l4.59 4.58L18 14l-6-6-6 6 1.41 1.41z"})
                                                 "KeyboardArrowUpOutlined"))
