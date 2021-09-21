(ns reagent-mui.icons.signal-cellular-no-sim-sharp
  "Imports @mui/icons-material/SignalCellularNoSimSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-no-sim-sharp (create-svg-icon (e "path" #js {"d" "M19 3h-9L7.95 5.06 19 16.11zm-15.21.74L2.38 5.15 5 7.77V21h13.23l1.62 1.62 1.41-1.41z"})
                                                   "SignalCellularNoSimSharp"))
