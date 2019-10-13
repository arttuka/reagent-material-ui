(ns reagent-material-ui.icons.arrow-drop-down
  "Imports @material-ui/icons/ArrowDropDown as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-drop-down (create-svg-icon (e "path" #js {"d" "M7 10l5 5 5-5z"})
                                      "ArrowDropDown"))
