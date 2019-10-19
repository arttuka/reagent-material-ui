(ns reagent-material-ui.icons.maximize-sharp
  "Imports @material-ui/icons/MaximizeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def maximize-sharp (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3V3z"})
                                     "MaximizeSharp"))
