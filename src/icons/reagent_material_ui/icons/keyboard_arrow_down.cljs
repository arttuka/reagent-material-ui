(ns reagent-material-ui.icons.keyboard-arrow-down
  "Imports @material-ui/icons/KeyboardArrowDown as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def keyboard-arrow-down (create-svg-icon (e "path" #js {"d" "M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z"})
                                          "KeyboardArrowDown"))
