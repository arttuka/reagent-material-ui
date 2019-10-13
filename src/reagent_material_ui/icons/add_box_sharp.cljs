(ns reagent-material-ui.icons.add-box-sharp
  "Imports @material-ui/icons/AddBoxSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-box-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-4 10h-4v4h-2v-4H7v-2h4V7h2v4h4v2z"})
                                    "AddBoxSharp"))
