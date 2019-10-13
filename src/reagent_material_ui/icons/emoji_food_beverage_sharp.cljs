(ns reagent-material-ui.icons.emoji-food-beverage-sharp
  "Imports @material-ui/icons/EmojiFoodBeverageSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def emoji-food-beverage-sharp (create-svg-icon (e "path" #js {"d" "M2 19h18v2H2zM20 3H9v2.4L11 7v5H6V7l2-1.6V3H4v14h14v-7h2c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 5h-2V5h2v3z"})
                                                "EmojiFoodBeverageSharp"))
