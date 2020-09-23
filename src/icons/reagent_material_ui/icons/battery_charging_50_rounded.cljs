(ns reagent-material-ui.icons.battery-charging-50-rounded
  "Imports @material-ui/icons/BatteryCharging50Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-charging-50-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11.94 18.24c-.24.45-.94.28-.94-.24v-3.5H9.83c-.38 0-.62-.4-.44-.74l.14-.26H7v7.17C7 21.4 7.6 22 8.33 22h7.33c.74 0 1.34-.6 1.34-1.33V13.5h-2.53l-2.53 4.74z"}) (e "path" #js {"d" "M15.67 4H14V3c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v1H8.33C7.6 4 7 4.6 7 5.33v8.17h2.53l2.53-4.74c.24-.45.94-.28.94.24v3.5h1.17c.38 0 .62.4.44.74l-.14.26H17V5.33C17 4.6 16.4 4 15.67 4z", "fillOpacity" ".3"}))
                                                  "BatteryCharging50Rounded"))
