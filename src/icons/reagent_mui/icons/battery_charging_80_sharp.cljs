(ns reagent-mui.icons.battery-charging-80-sharp
  "Imports @mui/icons-material/BatteryCharging80Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-charging-80-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v5h4.93L13 7v2h4V4z"}) (e "path" #js {"d" "M13 12.5h2L11 20v-5.5H9L11.93 9H7v13h10V9h-4v3.5z"}))
                                                "BatteryCharging80Sharp"))
