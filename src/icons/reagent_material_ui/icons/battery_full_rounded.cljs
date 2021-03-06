(ns reagent-material-ui.icons.battery-full-rounded
  "Imports @material-ui/icons/BatteryFullRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-full-rounded (create-svg-icon (e "path" #js {"d" "M17 4h-3V2h-4v2H7v18h10V4z"})
                                           "BatteryFullRounded"))
