(ns reagent-material-ui.icons.keyboard-arrow-up-two-tone
  "Imports @material-ui/icons/KeyboardArrowUpTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-arrow-up-two-tone (create-svg-icon (e "path" #js {"d" "M7.41 15.41L12 10.83l4.59 4.58L18 14l-6-6-6 6 1.41 1.41z"})
                                                 "KeyboardArrowUpTwoTone"))
