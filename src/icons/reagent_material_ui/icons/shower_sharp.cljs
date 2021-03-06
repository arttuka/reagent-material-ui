(ns reagent-material-ui.icons.shower-sharp
  "Imports @material-ui/icons/ShowerSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def shower-sharp (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "17", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "12"}) (e "circle" #js {"cy" "17", "r" "1", "cx" "16"}) (e "path" #js {"d" "M13 5.08V3h-2v2.08C7.61 5.57 5 8.47 5 12v2h14v-2c0-3.53-2.61-6.43-6-6.92z"}) (e "circle" #js {"cy" "20", "r" "1", "cx" "8"}) (e "circle" #js {"cy" "20", "r" "1", "cx" "12"}) (e "circle" #js {"cy" "20", "r" "1", "cx" "16"}))
                                   "ShowerSharp"))