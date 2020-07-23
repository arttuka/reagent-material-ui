(ns reagent-material-ui.icons.format-align-justify
  "Imports @material-ui/icons/FormatAlignJustify as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-align-justify (create-svg-icon (e "path" #js {"d" "M3 21h18v-2H3v2zm0-4h18v-2H3v2zm0-4h18v-2H3v2zm0-4h18V7H3v2zm0-6v2h18V3H3z"})
                                           "FormatAlignJustify"))
