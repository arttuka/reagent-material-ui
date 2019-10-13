(ns reagent-material-ui.icons.backspace-two-tone
  "Imports @material-ui/icons/BackspaceTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def backspace-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M7.06 5L2.4 12l4.67 7H22V5H7.06c.01 0 .01 0 0 0zM9 8.41L10.41 7 14 10.59 17.59 7 19 8.41 15.41 12 19 15.59 17.59 17 14 13.41 10.41 17 9 15.59 12.59 12 9 8.41z", "opacity" ".3"}) (e "path" #js {"d" "M22 3H7c-.69 0-1.23.35-1.59.88L0 12l5.41 8.11c.36.53.9.89 1.59.89h15c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H7.07L2.4 12l4.66-7H22v14zm-11.59-2L14 13.41 17.59 17 19 15.59 15.41 12 19 8.41 17.59 7 14 10.59 10.41 7 9 8.41 12.59 12 9 15.59z"}))
                                         "BackspaceTwoTone"))
