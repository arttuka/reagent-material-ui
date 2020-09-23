(ns reagent-material-ui.icons.filter-alt-sharp
  "Imports @material-ui/icons/FilterAltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-alt-sharp (create-svg-icon (e "path" #js {"d" "M3 4c2.01 2.59 7 9 7 9v7h4v-7s4.98-6.41 7-9H3z"})
                                       "FilterAltSharp"))
