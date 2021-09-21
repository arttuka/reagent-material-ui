(ns reagent-mui.icons.signal-cellular-alt-sharp
  "Imports @mui/icons-material/SignalCellularAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-alt-sharp (create-svg-icon (e "path" #js {"d" "M17 4h3v16h-3V4zM5 14h3v6H5v-6zm6-5h3v11h-3V9z"})
                                                "SignalCellularAltSharp"))
