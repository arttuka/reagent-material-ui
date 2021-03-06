(ns reagent-material-ui.icons.ramen-dining
  "Imports @material-ui/icons/RamenDining as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def ramen-dining (create-svg-icon (e "path" #js {"d" "M9 6H8V4.65l1-.12V6zm0 6H8V7h1v5zM6 7h1v5H6V7zm0-2.12l1-.12V6H6V4.88zM22 3V2L5 4v8H2c0 3.69 2.47 6.86 6 8.25V22h8v-1.75c3.53-1.39 6-4.56 6-8.25H10V7h12V6H10V4.41L22 3z"})
                                   "RamenDining"))
