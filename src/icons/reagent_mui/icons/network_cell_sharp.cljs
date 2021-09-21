(ns reagent-mui.icons.network-cell-sharp
  "Imports @mui/icons-material/NetworkCellSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def network-cell-sharp (create-svg-icon (e "path" #js {"d" "M2 22h20V2L2 22zm18-2h-3V9.83l3-3V20z"})
                                         "NetworkCellSharp"))
