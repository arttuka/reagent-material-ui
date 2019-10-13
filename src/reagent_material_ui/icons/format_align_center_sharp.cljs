(ns reagent-material-ui.icons.format-align-center-sharp
  "Imports @material-ui/icons/FormatAlignCenterSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-align-center-sharp (create-svg-icon (e "path" #js {"d" "M7 15v2h10v-2H7zm-4 6h18v-2H3v2zm0-8h18v-2H3v2zm4-6v2h10V7H7zM3 3v2h18V3H3z"})
                                                "FormatAlignCenterSharp"))
