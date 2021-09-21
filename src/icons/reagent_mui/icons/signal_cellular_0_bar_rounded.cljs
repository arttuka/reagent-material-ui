(ns reagent-mui.icons.signal-cellular-0-bar-rounded
  "Imports @mui/icons-material/SignalCellular0BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-0-bar-rounded (create-svg-icon (e "path" #js {"d" "M4.41 22H21c.55 0 1-.45 1-1V4.41c0-.89-1.08-1.34-1.71-.71L3.71 20.29c-.63.63-.19 1.71.7 1.71zM20 20H6.83L20 6.83V20z"})
                                                    "SignalCellular0BarRounded"))
