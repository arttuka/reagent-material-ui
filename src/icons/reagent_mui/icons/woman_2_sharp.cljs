(ns reagent-mui.icons.woman-2-sharp
  "Imports @mui/icons-material/Woman2Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def woman-2-sharp (create-svg-icon [(e "path" #js {"d" "M13.41 7h-2.82L7 16h3.5v6h3v-6H17z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                    "Woman2Sharp"))
