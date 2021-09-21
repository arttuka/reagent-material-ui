(ns reagent-mui.icons.five-g-sharp
  "Imports @mui/icons-material/FiveGSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def five-g-sharp (create-svg-icon (e "path" #js {"d" "M17 13h2v2h-5V9h7V7h-9v10h9v-6h-4zM3 13h5v2H3v2h7v-6H5V9h5V7H3z"})
                                   "FiveGSharp"))
