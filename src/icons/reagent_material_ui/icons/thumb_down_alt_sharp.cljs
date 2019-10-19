(ns reagent-material-ui.icons.thumb-down-alt-sharp
  "Imports @material-ui/icons/ThumbDownAltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def thumb-down-alt-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 0h24v24H0V0z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M1 11.6V16h8.31l-1.12 5.38L9.83 23 17 15.82V3H4.69zM19 3h4v12h-4z"}))
                                           "ThumbDownAltSharp"))
