(ns reagent-material-ui.icons.details
  "Imports @material-ui/icons/Details as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def details (create-svg-icon (e "path" #js {"d" "M3 4l9 16 9-16H3zm3.38 2h11.25L12 16 6.38 6z"})
                              "Details"))
