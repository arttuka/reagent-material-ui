(ns reagent-material-ui.icons.send-two-tone
  "Imports @material-ui/icons/SendTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def send-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M4 8.25l7.51 1-7.5-3.22zm.01 9.72l7.5-3.22-7.51 1z", "opacity" ".3"}) (e "path" #js {"d" "M2.01 3L2 10l15 2-15 2 .01 7L23 12 2.01 3zM4 8.25V6.03l7.51 3.22-7.51-1zm.01 9.72v-2.22l7.51-1-7.51 3.22z"}))
                                    "SendTwoTone"))
