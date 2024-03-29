(ns reagent-mui.icons.airline-seat-individual-suite-sharp
  "Imports @mui/icons-material/AirlineSeatIndividualSuiteSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def airline-seat-individual-suite-sharp (create-svg-icon (e "path" #js {"d" "M7 13c1.65 0 3-1.35 3-3S8.65 7 7 7s-3 1.35-3 3 1.35 3 3 3zm16-6H11v7H3V7H1v10h22V7z"})
                                                          "AirlineSeatIndividualSuiteSharp"))
