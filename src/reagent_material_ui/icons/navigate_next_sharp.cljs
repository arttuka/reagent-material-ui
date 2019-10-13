(ns reagent-material-ui.icons.navigate-next-sharp
  "Imports @material-ui/icons/NavigateNextSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def navigate-next-sharp (create-svg-icon (e "path" #js {"d" "M10.02 6L8.61 7.41 13.19 12l-4.58 4.59L10.02 18l6-6-6-6z"})
                                          "NavigateNextSharp"))
