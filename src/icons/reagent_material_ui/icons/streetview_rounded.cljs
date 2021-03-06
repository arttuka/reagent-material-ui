(ns reagent-material-ui.icons.streetview-rounded
  "Imports @material-ui/icons/StreetviewRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def streetview-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "6", "r" "5", "cx" "18"}) (e "path" #js {"d" "M11 6c0-1.07.25-2.09.69-3H5c-1.1 0-2 .9-2 2v14c0 .55.23 1.05.59 1.41l9.46-9.46C11.79 9.68 11 7.93 11 6zm3.29 6.66c-1.35.3-2.29 1.53-2.29 2.92V21h7c1.1 0 2-.9 2-2v-6.48c-.95-.17-1.95-.27-3-.27-1.32 0-2.56.15-3.71.41z"}))
                                         "StreetviewRounded"))
