(ns reagent-material-ui.icons.directions-sharp
  "Imports @material-ui/icons/DirectionsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def directions-sharp (create-svg-icon (e "path" #js {"d" "M22.41 12L12 1.59 1.59 11.99 12 22.41 22.41 12zM14 14.5V12h-4v3H8v-5h6V7.5l3.5 3.5-3.5 3.5z"})
                                       "DirectionsSharp"))
