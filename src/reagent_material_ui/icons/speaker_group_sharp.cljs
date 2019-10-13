(ns reagent-material-ui.icons.speaker-group-sharp
  "Imports @material-ui/icons/SpeakerGroupSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def speaker-group-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M20 1H8v17.99h12V1zm-6 2c1.1 0 2 .89 2 2s-.9 2-2 2-2-.89-2-2 .9-2 2-2zm0 13.5c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4z"}) (e "circle" #js {"cy" "12.5", "r" "2.5", "cx" "14"}) (e "path" #js {"d" "M6 5H4v18h12v-2H6z"}))
                                          "SpeakerGroupSharp"))
