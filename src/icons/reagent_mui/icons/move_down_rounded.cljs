(ns reagent-mui.icons.move-down-rounded
  "Imports @mui/icons-material/MoveDownRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def move-down-rounded (create-svg-icon (e "path" #js {"d" "M3.01 10.72c-.14 2.57 1.66 4.73 4.07 5.18l-.79-.79a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l2.59 2.59c.39.39.39 1.02 0 1.41l-2.58 2.6c-.39.39-1.02.39-1.41 0a.9959.9959 0 0 1 0-1.41l.88-.88v-.06c-3.64-.43-6.43-3.65-6.15-7.47C1.29 6.78 4.55 4 8.26 4H10c.55 0 1 .45 1 1s-.45 1-1 1H8.22c-2.7 0-5.07 2.04-5.21 4.72zM15 11h5c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2h-5c-1.1 0-2 .9-2 2v3c0 1.1.9 2 2 2zm5-2h-5V6h5v3zm0 11h-5c-1.1 0-2-.9-2-2v-3c0-1.1.9-2 2-2h5c1.1 0 2 .9 2 2v3c0 1.1-.9 2-2 2z"})
                                        "MoveDownRounded"))
