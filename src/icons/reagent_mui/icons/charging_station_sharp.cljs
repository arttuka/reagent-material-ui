(ns reagent-mui.icons.charging-station-sharp
  "Imports @mui/icons-material/ChargingStationSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def charging-station-sharp (create-svg-icon (e "path" #js {"d" "m14.5 11-3 6v-4h-2l3-6v4h2zM5 1h14v22H5V1zm2 5v12h10V6H7z"})
                                             "ChargingStationSharp"))
