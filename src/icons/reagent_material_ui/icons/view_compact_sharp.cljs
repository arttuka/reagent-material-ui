(ns reagent-material-ui.icons.view-compact-sharp
  "Imports @material-ui/icons/ViewCompactSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-compact-sharp (create-svg-icon (e "path" #js {"d" "M3 19h6v-7H3v7zm7 0h12v-7H10v7zM3 5v6h19V5H3z"})
                                         "ViewCompactSharp"))
