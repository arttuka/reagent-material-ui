(ns reagent-material-ui.icons.filter-frames-sharp
  "Imports @material-ui/icons/FilterFramesSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-frames-sharp (create-svg-icon (e "path" #js {"d" "M22 4h-6l-4-4-4 4H2v18h20V4zm-2 16H4V6h4.52l3.52-3.5L15.52 6H20v14zM18 8H6v10h12"})
                                          "FilterFramesSharp"))
