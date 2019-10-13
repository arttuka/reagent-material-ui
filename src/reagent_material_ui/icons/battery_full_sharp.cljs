(ns reagent-material-ui.icons.battery-full-sharp
  "Imports @material-ui/icons/BatteryFullSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-full-sharp (create-svg-icon (e "path" #js {"d" "M17 4h-3V2h-4v2H7v18h10V4z"})
                                         "BatteryFullSharp"))
