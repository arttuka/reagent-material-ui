(ns reagent-material-ui.icons.brush-sharp
  "Imports @material-ui/icons/BrushSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def brush-sharp (create-svg-icon (e "path" #js {"d" "M7 14c-1.66 0-3 1.34-3 3 0 1.31-1.16 2-2 2 .92 1.22 2.49 2 4 2 2.21 0 4-1.79 4-4 0-1.66-1.34-3-3-3zm14.41-8.66l-2.75-2.75L9 12.25 11.75 15l9.66-9.66z"})
                                  "BrushSharp"))
