(ns reagent-mui.icons.present-to-all-sharp
  "Imports @mui/icons-material/PresentToAllSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def present-to-all-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v18h22V3zm-2 16.02H3V4.98h18v14.04zM10 12H8l4-4 4 4h-2v4h-4v-4z"})
                                           "PresentToAllSharp"))
