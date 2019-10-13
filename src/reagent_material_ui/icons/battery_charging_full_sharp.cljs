(ns reagent-material-ui.icons.battery-charging-full-sharp
  "Imports @material-ui/icons/BatteryChargingFullSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-charging-full-sharp (create-svg-icon (e "path" #js {"d" "M17 4h-3V2h-4v2H7v18h10V4zm-6 16v-5.5H9L13 7v5.5h2L11 20z"})
                                                  "BatteryChargingFullSharp"))
