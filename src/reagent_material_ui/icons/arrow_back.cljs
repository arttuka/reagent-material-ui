(ns reagent-material-ui.icons.arrow-back
  "Imports @material-ui/icons/ArrowBack as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-back (create-svg-icon (e "path" #js {"d" "M20 11H7.83l5.59-5.59L12 4l-8 8 8 8 1.41-1.41L7.83 13H20v-2z"})
                                 "ArrowBack"))
