(ns reagent-mui.icons.adf-scanner-two-tone
  "Imports @mui/icons-material/AdfScannerTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def adf-scanner-two-tone (create-svg-icon [(e "path" #js {"d" "M8 6h8v6H8zm11 8H5c-.55 0-1 .45-1 1v3h16v-3c0-.55-.45-1-1-1zm-1 3c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z", "opacity" ".3"}) (e "path" #js {"d" "M19 12h-1V4H6v8H5c-1.66 0-3 1.34-3 3v5h20v-5c0-1.66-1.34-3-3-3zM8 6h8v6H8V6zm12 12H4v-3c0-.55.45-1 1-1h14c.55 0 1 .45 1 1v3z"}) (e "circle" #js {"cx" "18", "cy" "16", "r" "1"})]
                                           "AdfScannerTwoTone"))
