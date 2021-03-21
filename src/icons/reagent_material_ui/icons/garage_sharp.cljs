(ns reagent-material-ui.icons.garage-sharp
  "Imports @material-ui/icons/GarageSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def garage-sharp (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "13", "r" "1", "cx" "15"}) (e "circle" #js {"cy" "13", "r" "1", "cx" "9"}) (e "path" #js {"d" "M8.33 7.5l-.66 2h8.66l-.66-2z"}) (e "path" #js {"d" "M22 2H2v20h20V2zm-3 16.5h-2v-2H7v2H5v-7.31L6.89 5.5H17.1l1.9 5.69v7.31z"}))
                                   "GarageSharp"))
