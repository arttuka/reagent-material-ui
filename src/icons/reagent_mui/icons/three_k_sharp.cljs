(ns reagent-mui.icons.three-k-sharp
  "Imports @mui/icons-material/ThreeKSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def three-k-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM11 9v6H6.5v-1.5h3v-1h-2v-1h2v-1h-3V9H11zm7 6h-1.75l-1.75-2.25V15H13V9h1.5v2.25L16.25 9H18l-2.25 3L18 15z"})
                                    "ThreeKSharp"))
