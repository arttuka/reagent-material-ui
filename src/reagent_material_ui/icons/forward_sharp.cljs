(ns reagent-material-ui.icons.forward-sharp
  "Imports @material-ui/icons/ForwardSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def forward-sharp (create-svg-icon (e "path" #js {"d" "M12 8V4l8 8-8 8v-4H4V8h8z"})
                                    "ForwardSharp"))
