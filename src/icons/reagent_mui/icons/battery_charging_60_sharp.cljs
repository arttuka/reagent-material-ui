(ns reagent-mui.icons.battery-charging-60-sharp
  "Imports @mui/icons-material/BatteryCharging60Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-charging-60-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v7h3.87L13 7v4h4V4z"}) (e "path" #js {"d" "M13 12.5h2L11 20v-5.5H9l1.87-3.5H7v11h10V11h-4v1.5z"}))
                                                "BatteryCharging60Sharp"))
