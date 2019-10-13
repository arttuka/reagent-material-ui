(ns reagent-material-ui.icons.arrow-left-sharp
  "Imports @material-ui/icons/ArrowLeftSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-left-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M24 0v24H0V0h24z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M14 7l-5 5 5 5V7z"}))
                                       "ArrowLeftSharp"))
