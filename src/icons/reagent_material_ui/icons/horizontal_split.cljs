(ns reagent-material-ui.icons.horizontal-split
  "Imports @material-ui/icons/HorizontalSplit as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def horizontal-split (create-svg-icon (e "path" #js {"d" "M3 19h18v-6H3v6zm0-8h18V9H3v2zm0-6v2h18V5H3z"})
                                       "HorizontalSplit"))
