(ns reagent-mui.icons.signal-cellular-off-rounded
  "Imports @mui/icons-material/SignalCellularOffRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-off-rounded (create-svg-icon (e "path" #js {"d" "M21 3.41c0-.89-1.08-1.34-1.71-.71l-6.6 6.6L21 17.61V3.41zm.44 17.47L5.62 5.06a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l5.66 5.66-7.16 7.16c-.63.63-.19 1.71.7 1.71h15.32l1.29 1.29c.39.39 1.02.39 1.41 0 .4-.39.4-1.02.01-1.41z"})
                                                  "SignalCellularOffRounded"))
