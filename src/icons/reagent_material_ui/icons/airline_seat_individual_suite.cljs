(ns reagent-material-ui.icons.airline-seat-individual-suite
  "Imports @material-ui/icons/AirlineSeatIndividualSuite as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def airline-seat-individual-suite (create-svg-icon (e "path" #js {"d" "M7 13c1.65 0 3-1.35 3-3S8.65 7 7 7s-3 1.35-3 3 1.35 3 3 3zm12-6h-8v7H3V7H1v10h22v-6c0-2.21-1.79-4-4-4z"})
                                                    "AirlineSeatIndividualSuite"))
