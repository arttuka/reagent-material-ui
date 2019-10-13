(ns reagent-material-ui.icons.scanner-sharp
  "Imports @material-ui/icons/ScannerSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def scanner-sharp (create-svg-icon (e "path" #js {"d" "M4.2 5l-.7 1.9L17.6 12H3v8h18v-8.86L4.2 5zM7 17H5v-2h2v2zm12 0H9v-2h10v2z"})
                                    "ScannerSharp"))
