(ns reagent-mui.icons.sim-card-download-sharp
  "Imports @mui/icons-material/SimCardDownloadSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sim-card-download-sharp (create-svg-icon (e "path" #js {"d" "M20 2H10L4 8v14h16V2zm-8 15-4-4h3V9.02L13 9v4h3l-4 4z"})
                                              "SimCardDownloadSharp"))
