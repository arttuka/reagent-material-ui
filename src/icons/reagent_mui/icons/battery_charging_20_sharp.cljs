(ns reagent-mui.icons.battery-charging-20-sharp
  "Imports @mui/icons-material/BatteryCharging20Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-charging-20-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"d" "M11 20v-3H7v5h10v-5h-4.4L11 20z"}) (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v13h4v-2.5H9L13 7v5.5h2L12.6 17H17V4z"}))
                                                "BatteryCharging20Sharp"))
