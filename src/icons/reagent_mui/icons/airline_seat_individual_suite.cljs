(ns reagent-mui.icons.airline-seat-individual-suite
  "Imports @mui/icons-material/AirlineSeatIndividualSuite as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def airline-seat-individual-suite (create-svg-icon (e "path" #js {"d" "M7 13c1.65 0 3-1.35 3-3S8.65 7 7 7s-3 1.35-3 3 1.35 3 3 3zm12-6h-8v7H3V7H1v10h22v-6c0-2.21-1.79-4-4-4z"})
                                                    "AirlineSeatIndividualSuite"))
