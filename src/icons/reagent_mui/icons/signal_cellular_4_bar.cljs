(ns reagent-mui.icons.signal-cellular-4-bar
  "Imports @mui/icons-material/SignalCellular4Bar as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-4-bar (create-svg-icon (e "path" #js {"d" "M2 22h20V2z"})
                                            "SignalCellular4Bar"))
