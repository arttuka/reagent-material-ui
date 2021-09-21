(ns reagent-mui.icons.scanner-sharp
  "Imports @mui/icons-material/ScannerSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def scanner-sharp (create-svg-icon (e "path" #js {"d" "m4.2 5-.7 1.9L17.6 12H3v8h18v-8.86L4.2 5zM7 17H5v-2h2v2zm12 0H9v-2h10v2z"})
                                    "ScannerSharp"))
