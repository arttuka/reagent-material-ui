(ns reagent-material-ui.icons.battery-charging-90-sharp
  "Imports @material-ui/icons/BatteryCharging90Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-charging-90-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 4h-3V2h-4v2H7v4h5.47L13 7v1h4V4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M13 12.5h2L11 20v-5.5H9L12.47 8H7v14h10V8h-4v4.5z"}))
                                                "BatteryCharging90Sharp"))
