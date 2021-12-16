(ns reagent-mui.icons.adf-scanner-sharp
  "Imports @mui/icons-material/AdfScannerSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def adf-scanner-sharp (create-svg-icon (e "path" #js {"d" "M22 12h-4V4H6v8H2v8h20v-8zm-6 0H8V6h8v6zm2 5c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})
                                        "AdfScannerSharp"))
