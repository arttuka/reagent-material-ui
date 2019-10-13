(ns reagent-material-ui.icons.format-paint-sharp
  "Imports @material-ui/icons/FormatPaintSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-paint-sharp (create-svg-icon (e "path" #js {"d" "M18 4V2H4v6h14V6h1v4H9v12h4V12h8V4h-3z"})
                                         "FormatPaintSharp"))
