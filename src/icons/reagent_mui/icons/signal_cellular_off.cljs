(ns reagent-mui.icons.signal-cellular-off
  "Imports @mui/icons-material/SignalCellularOff as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-off (create-svg-icon (e "path" #js {"d" "m21 1-8.59 8.59L21 18.18V1zM4.77 4.5 3.5 5.77l6.36 6.36L1 21h17.73l2 2L22 21.73 4.77 4.5z"})
                                          "SignalCellularOff"))
