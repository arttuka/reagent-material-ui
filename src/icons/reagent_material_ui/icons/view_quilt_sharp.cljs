(ns reagent-material-ui.icons.view-quilt-sharp
  "Imports @material-ui/icons/ViewQuiltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-quilt-sharp (create-svg-icon (e "path" #js {"d" "M10 18h5v-6h-5v6zm-6 0h5V5H4v13zm12 0h5v-6h-5v6zM10 5v6h11V5H10z"})
                                       "ViewQuiltSharp"))
