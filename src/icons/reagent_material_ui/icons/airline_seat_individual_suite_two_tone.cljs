(ns reagent-material-ui.icons.airline-seat-individual-suite-two-tone
  "Imports @material-ui/icons/AirlineSeatIndividualSuiteTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def airline-seat-individual-suite-two-tone (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "11", "r" "1", "cx" "7", "opacity" ".3"}) (e "path" #js {"d" "M19 9h-6v6h8v-4c0-1.1-.9-2-2-2z", "opacity" ".3"}) (e "path" #js {"d" "M7 14c1.66 0 3-1.34 3-3S8.66 8 7 8s-3 1.34-3 3 1.34 3 3 3zm0-4c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm12-3h-8v8H3V7H1v10h22v-6c0-2.21-1.79-4-4-4zm2 8h-8V9h6c1.1 0 2 .9 2 2v4z"}))
                                                             "AirlineSeatIndividualSuiteTwoTone"))
