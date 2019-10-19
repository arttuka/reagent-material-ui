(ns reagent-material-ui.icons.speed-sharp
  "Imports @material-ui/icons/SpeedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def speed-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M20.39 8.56l-1.24 1.86a8 8 0 01-.22 7.58H5.07A8 8 0 0115.58 6.85l1.86-1.24A10 10 0 004 20h16a10 10 0 00.38-11.44z"}) (e "path" #js {"d" "M10.59 15.41a2 2 0 002.83 0l5.66-8.49-8.49 5.66a2 2 0 000 2.83z"}))
                                  "SpeedSharp"))
