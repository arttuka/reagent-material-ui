(ns reagent-material-ui.icons.fact-check-sharp
  "Imports @material-ui/icons/FactCheckSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def fact-check-sharp (create-svg-icon (e "path" #js {"d" "M2 3v18h20V3H2zm8 14H5v-2h5v2zm0-4H5v-2h5v2zm0-4H5V7h5v2zm4.82 6L12 12.16l1.41-1.41 1.41 1.42L17.99 9l1.42 1.42L14.82 15z", "fillRule" "evenodd"})
                                       "FactCheckSharp"))
