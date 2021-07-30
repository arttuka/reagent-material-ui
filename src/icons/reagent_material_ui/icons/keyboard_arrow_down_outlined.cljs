(ns reagent-material-ui.icons.keyboard-arrow-down-outlined
  "Imports @material-ui/icons/KeyboardArrowDownOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def keyboard-arrow-down-outlined (create-svg-icon (e "path" #js {"d" "M7.41 8.59 12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z"})
                                                   "KeyboardArrowDownOutlined"))
