(ns reagent-mui.icons.signal-cellular-4-bar-sharp
  "Imports @mui/icons-material/SignalCellular4BarSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-4-bar-sharp (create-svg-icon (e "path" #js {"d" "M2 22h20V2L2 22z"})
                                                  "SignalCellular4BarSharp"))
