(ns reagent-material-ui.icons.call-received-sharp
  "Imports @material-ui/icons/CallReceivedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-received-sharp (create-svg-icon (e "path" #js {"d" "M20 5.41L18.59 4 7 15.59V9H5v10h10v-2H8.41L20 5.41z"})
                                          "CallReceivedSharp"))
