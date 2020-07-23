(ns reagent-material-ui.icons.arrow-back-sharp
  "Imports @material-ui/icons/ArrowBackSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-back-sharp (create-svg-icon (e "path" #js {"d" "M20 11H7.83l5.59-5.59L12 4l-8 8 8 8 1.41-1.41L7.83 13H20v-2z"})
                                       "ArrowBackSharp"))
