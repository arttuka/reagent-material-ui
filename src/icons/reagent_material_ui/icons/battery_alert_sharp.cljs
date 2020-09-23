(ns reagent-material-ui.icons.battery-alert-sharp
  "Imports @material-ui/icons/BatteryAlertSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-alert-sharp (create-svg-icon (e "path" #js {"d" "M17 4h-3V2h-4v2H7v18h10V4zm-4 14h-2v-2h2v2zm0-4h-2V9h2v5z"})
                                          "BatteryAlertSharp"))
