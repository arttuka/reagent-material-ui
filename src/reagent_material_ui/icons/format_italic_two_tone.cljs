(ns reagent-material-ui.icons.format-italic-two-tone
  "Imports @material-ui/icons/FormatItalicTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-italic-two-tone (create-svg-icon (e "path" #js {"d" "M6 15v3h8v-3h-2.21l3.42-8H18V4h-8v3h2.21l-3.42 8z"})
                                             "FormatItalicTwoTone"))
