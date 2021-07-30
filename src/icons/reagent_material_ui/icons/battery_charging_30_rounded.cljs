(ns reagent-material-ui.icons.battery-charging-30-rounded
  "Imports @material-ui/icons/BatteryCharging30Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def battery-charging-30-rounded (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M15.67 4H14V3c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v1H8.33C7.6 4 7 4.6 7 5.33v9.17h2.83c-.38 0-.62-.4-.44-.74l2.67-5c.24-.45.94-.28.94.24v3.5h1.17c.38 0 .62.4.44.74l-.67 1.26H17V5.33C17 4.6 16.4 4 15.67 4z"}) (e "path" #js {"d" "M11.94 18.24c-.24.45-.94.28-.94-.24v-3.5H7v6.17C7 21.4 7.6 22 8.33 22h7.33c.74 0 1.34-.6 1.34-1.33V14.5h-3.07l-1.99 3.74z"}))
                                                  "BatteryCharging30Rounded"))
