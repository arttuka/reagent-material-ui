(ns reagent-material-ui.icons.thumb-up-alt-sharp
  "Imports @material-ui/icons/ThumbUpAltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def thumb-up-alt-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 0h24v24H0V0z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M14.17 1L7 8.18V21h12.31L23 12.4V8h-8.31l1.12-5.38zM1 9h4v12H1z"}))
                                         "ThumbUpAltSharp"))
