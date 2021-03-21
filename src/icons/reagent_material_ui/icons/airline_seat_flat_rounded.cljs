(ns reagent-material-ui.icons.airline-seat-flat-rounded
  "Imports @material-ui/icons/AirlineSeatFlatRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def airline-seat-flat-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 7h-7c-1.1 0-2 .9-2 2v5h13v-3c0-2.21-1.79-4-4-4z"}) (e "circle" #js {"cy" "11", "r" "3", "cx" "5"}) (e "path" #js {"d" "M3 17h18c.55 0 1-.45 1-1s-.45-1-1-1H3c-.55 0-1 .45-1 1s.45 1 1 1z"}))
                                                "AirlineSeatFlatRounded"))
