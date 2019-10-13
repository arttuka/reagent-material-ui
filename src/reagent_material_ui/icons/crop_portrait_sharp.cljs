(ns reagent-material-ui.icons.crop-portrait-sharp
  "Imports @material-ui/icons/CropPortraitSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-portrait-sharp (create-svg-icon (e "path" #js {"d" "M19 3H5v18h14V3zm-2 16H7V5h10v14z"})
                                          "CropPortraitSharp"))
