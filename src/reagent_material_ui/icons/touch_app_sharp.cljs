(ns reagent-material-ui.icons.touch-app-sharp
  "Imports @material-ui/icons/TouchAppSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def touch-app-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "defs" nil (e "path" #js {"d" "M0 0h24v24H0z", "id" "a"})) (e "path" #js {"d" "M9 11.24V7.5C9 6.12 10.12 5 11.5 5S14 6.12 14 7.5v3.74c1.21-.81 2-2.18 2-3.74C16 5.01 13.99 3 11.5 3S7 5.01 7 7.5c0 1.56.79 2.93 2 3.74zm5.08 2.26H13v-6c0-.83-.67-1.5-1.5-1.5S10 6.67 10 7.5v10.74l-4.04-.85-1.21 1.23L10.13 24h8.67l1.07-7.62-5.79-2.88z"}))
                                      "TouchAppSharp"))
