(ns reagent-mui.icons.keyboard-double-arrow-left-outlined
  "Imports @mui/icons-material/KeyboardDoubleArrowLeftOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-double-arrow-left-outlined (create-svg-icon [(e "path" #js {"d" "M17.59 18 19 16.59 14.42 12 19 7.41 17.59 6l-6 6z"}) (e "path" #js {"d" "m11 18 1.41-1.41L7.83 12l4.58-4.59L11 6l-6 6z"})]
                                                          "KeyboardDoubleArrowLeftOutlined"))
