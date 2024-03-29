(ns reagent-mui.icons.garage-sharp
  "Imports @mui/icons-material/GarageSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def garage-sharp (create-svg-icon [(e "circle" #js {"cx" "15", "cy" "13", "r" "1"}) (e "circle" #js {"cx" "9", "cy" "13", "r" "1"}) (e "path" #js {"d" "m8.33 7.5-.66 2h8.66l-.66-2z"}) (e "path" #js {"d" "M22 2H2v20h20V2zm-3 16.5h-2v-2H7v2H5v-7.31L6.89 5.5H17.1l1.9 5.69v7.31z"})]
                                   "GarageSharp"))
