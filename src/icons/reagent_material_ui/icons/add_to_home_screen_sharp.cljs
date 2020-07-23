(ns reagent-material-ui.icons.add-to-home-screen-sharp
  "Imports @material-ui/icons/AddToHomeScreenSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-to-home-screen-sharp (create-svg-icon (e "path" #js {"d" "M20 1.01L6 1v5h2V5h10v14H8v-1H6v5h14V1.01zM10 15h2V8H5v2h3.59L3 15.59 4.41 17 10 11.41V15z"})
                                               "AddToHomeScreenSharp"))
