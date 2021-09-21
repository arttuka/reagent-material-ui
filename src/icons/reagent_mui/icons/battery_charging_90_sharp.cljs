(ns reagent-mui.icons.battery-charging-90-sharp
  "Imports @mui/icons-material/BatteryCharging90Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-charging-90-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v4h5.47L13 7v1h4V4z"}) (e "path" #js {"d" "M13 12.5h2L11 20v-5.5H9L12.47 8H7v14h10V8h-4v4.5z"}))
                                                "BatteryCharging90Sharp"))
