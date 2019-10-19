(ns reagent-material-ui.icons.add-box-two-tone
  "Imports @material-ui/icons/AddBoxTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-box-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M5 19h14V5H5v14zm2-8h4V7h2v4h4v2h-4v4h-2v-4H7v-2z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14zm-8-2h2v-4h4v-2h-4V7h-2v4H7v2h4z"}))
                                       "AddBoxTwoTone"))
