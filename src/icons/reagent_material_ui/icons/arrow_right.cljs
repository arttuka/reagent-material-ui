(ns reagent-material-ui.icons.arrow-right
  "Imports @material-ui/icons/ArrowRight as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-right (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M10 17l5-5-5-5v10z"}) (e "path" #js {"d" "M0 24V0h24v24H0z", "fill" "none"}))
                                  "ArrowRight"))
