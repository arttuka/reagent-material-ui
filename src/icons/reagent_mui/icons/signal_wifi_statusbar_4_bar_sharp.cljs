(ns reagent-mui.icons.signal-wifi-statusbar-4-bar-sharp
  "Imports @mui/icons-material/SignalWifiStatusbar4BarSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-wifi-statusbar-4-bar-sharp (create-svg-icon (e "path" #js {"d" "M12 4C7.31 4 3.07 5.9 0 8.98L12 21 24 8.98C20.93 5.9 16.69 4 12 4z"})
                                                        "SignalWifiStatusbar4BarSharp"))
