(ns reagent-mui.icons.battery-charging-30-sharp
  "Imports @mui/icons-material/BatteryCharging30Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-charging-30-sharp (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M17 4h-3V2h-4v2H7v10.5h2L13 7v5.5h2l-1.07 2H17V4z"}) (e "path" #js {"d" "M11 20v-5.5H7V22h10v-7.5h-3.07L11 20z"}))
                                                "BatteryCharging30Sharp"))
