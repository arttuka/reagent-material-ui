(ns reagent-mui.icons.four-k-plus-sharp
  "Imports @mui/icons-material/FourKPlusSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def four-k-plus-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM11 13.5h-1V15H8.5v-1.5h-3V9H7v3h1.5V9H10v3h1v1.5zm3.75 1.5L13 12.75V15h-1.5V9H13v2.25L14.75 9h1.75l-2.25 3 2.25 3h-1.75zM19 12.5h-1.5V14h-1v-1.5H15v-1h1.5V10h1v1.5H19v1z"})
                                        "FourKPlusSharp"))
