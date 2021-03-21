(ns reagent-material-ui.icons.shower-rounded
  "Imports @material-ui/icons/ShowerRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def shower-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "17", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "12"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "16"}) (e "path" #js {"d" "M13 5.08V4c0-.55-.45-1-1-1s-1 .45-1 1v1.08C7.61 5.57 5 8.47 5 12v1c0 .55.45 1 1 1h12c.55 0 1-.45 1-1v-1c0-3.53-2.61-6.43-6-6.92z"}) (e "circle" #js {"cy" "20", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "20", "r" "1", "cx" "12"}) (e "circle" #js {"cy" "20", "r" "1", "cx" "16"}))
                                     "ShowerRounded"))
