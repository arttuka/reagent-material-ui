(ns reagent-material-ui.icons.record-voice-over
  "Imports @material-ui/icons/RecordVoiceOver as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def record-voice-over (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "9", "r" "4", "cx" "9"}) (e "path" #js {"d" "M9 15c-2.67 0-8 1.34-8 4v2h16v-2c0-2.66-5.33-4-8-4zm7.76-9.64l-1.68 1.69c.84 1.18.84 2.71 0 3.89l1.68 1.69c2.02-2.02 2.02-5.07 0-7.27zM20.07 2l-1.63 1.63c2.77 3.02 2.77 7.56 0 10.74L20.07 16c3.9-3.89 3.91-9.95 0-14z"}))
                                        "RecordVoiceOver"))
