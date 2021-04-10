(ns reagent-material-ui.icons.battery-std-sharp
  "Imports @material-ui/icons/BatteryStdSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def battery-std-sharp (create-svg-icon (e "path" #js {"d" "M17 4h-3V2h-4v2H7v18h10V4z"})
                                        "BatteryStdSharp"))
