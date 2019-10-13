(ns reagent-material-ui.icons.unfold-less-two-tone
  "Imports @material-ui/icons/UnfoldLessTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def unfold-less-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M24 0v24H0V0h24z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M7.41 18.59L8.83 20 12 16.83 15.17 20l1.41-1.41L12 14l-4.59 4.59zm9.18-13.18L15.17 4 12 7.17 8.83 4 7.41 5.41 12 10l4.59-4.59z"}))
                                           "UnfoldLessTwoTone"))
