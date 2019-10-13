(ns reagent-material-ui.icons.format-quote-sharp
  "Imports @material-ui/icons/FormatQuoteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-quote-sharp (create-svg-icon (e "path" #js {"d" "M5 17h3l2-4V7H4v6h3l-2 4zm10 0h3l2-4V7h-6v6h3l-2 4z"})
                                         "FormatQuoteSharp"))
