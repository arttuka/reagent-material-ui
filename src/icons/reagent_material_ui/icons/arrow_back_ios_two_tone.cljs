(ns reagent-material-ui.icons.arrow-back-ios-two-tone
  "Imports @material-ui/icons/ArrowBackIosTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-back-ios-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 0h24v24H0V0z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M17.51 3.87L15.73 2.1 5.84 12l9.9 9.9 1.77-1.77L9.38 12l8.13-8.13z"}))
                                              "ArrowBackIosTwoTone"))
