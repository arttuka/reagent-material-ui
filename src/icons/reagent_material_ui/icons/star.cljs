(ns reagent-material-ui.icons.star
  "Imports @material-ui/icons/Star as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def star (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12 17.27L18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2 9.19 8.63 2 9.24l5.46 4.73L5.82 21z"}) (e "path" #js {"d" "M0 0h24v24H0z", "fill" "none"}))
                           "Star"))
