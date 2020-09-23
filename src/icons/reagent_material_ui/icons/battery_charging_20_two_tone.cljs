(ns reagent-material-ui.icons.battery-charging-20-two-tone
  "Imports @material-ui/icons/BatteryCharging20TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-charging-20-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11 20v-3H7v3.67C7 21.4 7.6 22 8.33 22h7.33c.74 0 1.34-.6 1.34-1.33V17h-4.4L11 20z"}) (e "path" #js {"d" "M15.67 4H14V2h-4v2H8.33C7.6 4 7 4.6 7 5.33V17h4v-2.5H9L13 7v5.5h2L12.6 17H17V5.33C17 4.6 16.4 4 15.67 4z", "fillOpacity" ".3"}))
                                                   "BatteryCharging20TwoTone"))
