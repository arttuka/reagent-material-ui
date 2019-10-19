(ns reagent-material-ui.icons.turned-in-sharp
  "Imports @material-ui/icons/TurnedInSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def turned-in-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5v18l7-3 7 3V3z"})
                                      "TurnedInSharp"))
