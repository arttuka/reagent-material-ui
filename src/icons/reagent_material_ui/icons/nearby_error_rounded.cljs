(ns reagent-material-ui.icons.nearby-error-rounded
  "Imports @material-ui/icons/NearbyErrorRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def nearby-error-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11.29 8.28l-3.01 3.01c-.39.39-.39 1.02 0 1.41l3.01 3.01c.39.39 1.02.39 1.41 0l3.01-3.01c.39-.39.39-1.02 0-1.41L12.7 8.28c-.38-.39-1.02-.39-1.41 0z"}) (e "path" #js {"d" "M10.59 2.59l-8.01 8c-.78.78-.78 2.05 0 2.83l8.01 8c.78.78 2.05.78 2.83 0l4.58-4.6V13.2l-6 6L4.79 12 12 4.79l6 6V7.17l-4.58-4.58c-.78-.79-2.05-.79-2.83 0zM20 11v6c0 .55.45 1 1 1s1-.45 1-1v-6c0-.55-.45-1-1-1s-1 .45-1 1z"}) (e "circle" #js {"cy" "21", "r" "1", "cx" "21"}))
                                           "NearbyErrorRounded"))
