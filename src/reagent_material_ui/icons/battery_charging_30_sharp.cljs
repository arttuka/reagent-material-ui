(ns reagent-material-ui.icons.battery-charging-30-sharp
  "Imports @material-ui/icons/BatteryCharging30Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-charging-30-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M17 4h-3V2h-4v2H7v10.5h2L13 7v5.5h2l-1.07 2H17V4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M11 20v-5.5H7V22h10v-7.5h-3.07L11 20z"}))
                                                "BatteryCharging30Sharp"))
