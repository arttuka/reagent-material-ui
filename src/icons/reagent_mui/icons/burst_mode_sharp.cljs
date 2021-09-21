(ns reagent-mui.icons.burst-mode-sharp
  "Imports @mui/icons-material/BurstModeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def burst-mode-sharp (create-svg-icon (e "path" #js {"d" "M1 5h2v14H1V5zm4 0h2v14H5V5zm18 0H9v14h14V5zM11 17l2.5-3.15L15.29 16l2.5-3.22L21 17H11z"})
                                       "BurstModeSharp"))
