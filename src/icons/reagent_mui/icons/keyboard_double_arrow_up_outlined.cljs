(ns reagent-mui.icons.keyboard-double-arrow-up-outlined
  "Imports @mui/icons-material/KeyboardDoubleArrowUpOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-double-arrow-up-outlined (create-svg-icon [(e "path" #js {"d" "M6 17.59 7.41 19 12 14.42 16.59 19 18 17.59l-6-6z"}) (e "path" #js {"d" "m6 11 1.41 1.41L12 7.83l4.59 4.58L18 11l-6-6z"})]
                                                        "KeyboardDoubleArrowUpOutlined"))
