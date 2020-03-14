(ns reagent-material-ui.icons.arrow-right
  "Imports @material-ui/icons/ArrowRight as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-right (create-svg-icon (e "path" #js {"d" "M10 17l5-5-5-5v10z"})
                                  "ArrowRight"))
