(ns reagent-material-ui.icons.camera-alt
  "Imports @material-ui/icons/CameraAlt as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def camera-alt (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "12", "r" "3.2", "cx" "12"}) (e "path" #js {"d" "M9 2L7.17 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2h-3.17L15 2H9zm3 15c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"}))
                                 "CameraAlt"))
