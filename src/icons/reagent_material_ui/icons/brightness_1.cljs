(ns reagent-material-ui.icons.brightness-1
  "Imports @material-ui/icons/Brightness1 as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def brightness-1 (create-svg-icon (e "circle" #js {"cy" "12", "r" "10", "cx" "12"})
                                   "Brightness1"))
