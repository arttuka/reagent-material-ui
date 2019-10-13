(ns reagent-material-ui.icons.exposure-plus-1
  "Imports @material-ui/icons/ExposurePlus1 as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def exposure-plus-1 (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M0 0h24v24H0zm0 0h24v24H0z", "fill" "none"}) (e "path" #js {"d" "M10 7H8v4H4v2h4v4h2v-4h4v-2h-4V7zm10 11h-2V7.38L15 8.4V6.7L19.7 5h.3v13z"}))
                                      "ExposurePlus1"))
