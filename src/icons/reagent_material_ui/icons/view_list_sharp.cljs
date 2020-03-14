(ns reagent-material-ui.icons.view-list-sharp
  "Imports @material-ui/icons/ViewListSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-list-sharp (create-svg-icon (e "path" #js {"d" "M3 14h4v-4H3v4zm0 5h4v-4H3v4zM3 9h4V5H3v4zm5 5h12v-4H8v4zm0 5h12v-4H8v4zM8 5v4h12V5H8z"})
                                      "ViewListSharp"))
