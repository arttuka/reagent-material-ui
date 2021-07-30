(ns reagent-material-ui.icons.scanner-sharp
  "Imports @material-ui/icons/ScannerSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def scanner-sharp (create-svg-icon (e "path" #js {"d" "m4.2 5-.7 1.9L17.6 12H3v8h18v-8.86L4.2 5zM7 17H5v-2h2v2zm12 0H9v-2h10v2z"})
                                    "ScannerSharp"))
