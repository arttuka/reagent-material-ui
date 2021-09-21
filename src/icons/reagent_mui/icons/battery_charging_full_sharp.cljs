(ns reagent-mui.icons.battery-charging-full-sharp
  "Imports @mui/icons-material/BatteryChargingFullSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-charging-full-sharp (create-svg-icon (e "path" #js {"d" "M17 4h-3V2h-4v2H7v18h10V4zm-6 16v-5.5H9L13 7v5.5h2L11 20z"})
                                                  "BatteryChargingFullSharp"))
