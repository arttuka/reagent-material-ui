(ns reagent-material-ui.icons.keyboard-arrow-down
  "Imports @material-ui/icons/KeyboardArrowDown as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-arrow-down (create-svg-icon (e "path" #js {"d" "M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z"})
                                          "KeyboardArrowDown"))
