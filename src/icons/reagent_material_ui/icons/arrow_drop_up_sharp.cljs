(ns reagent-material-ui.icons.arrow-drop-up-sharp
  "Imports @material-ui/icons/ArrowDropUpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-drop-up-sharp (create-svg-icon (e "path" #js {"d" "M7 14l5-5 5 5H7z"})
                                          "ArrowDropUpSharp"))
