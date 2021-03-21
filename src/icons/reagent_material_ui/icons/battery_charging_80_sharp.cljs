(ns reagent-material-ui.icons.battery-charging-80-sharp
  "Imports @material-ui/icons/BatteryCharging80Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def battery-charging-80-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 4h-3V2h-4v2H7v5h4.93L13 7v2h4V4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M13 12.5h2L11 20v-5.5H9L11.93 9H7v13h10V9h-4v3.5z"}))
                                                "BatteryCharging80Sharp"))
