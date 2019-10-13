(ns reagent-material-ui.icons.radio-button-checked-rounded
  "Imports @material-ui/icons/RadioButtonCheckedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def radio-button-checked-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"}) (e "circle" #js {"cy" "12", "r" "5", "cx" "12"}))
                                                   "RadioButtonCheckedRounded"))
