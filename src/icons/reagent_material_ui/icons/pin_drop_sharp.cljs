(ns reagent-material-ui.icons.pin-drop-sharp
  "Imports @material-ui/icons/PinDropSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def pin-drop-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M18 8c0-3.31-2.69-6-6-6S6 4.69 6 8c0 4.5 6 11 6 11s6-6.5 6-11zm-8 0c0-1.1.9-2 2-2s2 .9 2 2-.89 2-2 2c-1.1 0-2-.9-2-2zM5 20v2h14v-2H5z"}))
                                     "PinDropSharp"))
