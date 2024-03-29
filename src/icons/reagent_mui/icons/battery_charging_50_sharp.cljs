(ns reagent-mui.icons.battery-charging-50-sharp
  "Imports @mui/icons-material/BatteryCharging50Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-charging-50-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"d" "M14.47 13.5L11 20v-5.5H9l.53-1H7V22h10v-8.5h-2.53z"}) (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v9.5h2.53L13 7v5.5h2l-.53 1H17V4z"}))
                                                "BatteryCharging50Sharp"))
