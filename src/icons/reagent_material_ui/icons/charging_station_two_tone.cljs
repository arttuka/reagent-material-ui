(ns reagent-material-ui.icons.charging-station-two-tone
  "Imports @material-ui/icons/ChargingStationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def charging-station-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 3v1H7V3h10m0 17H7v1h10v-1", "opacity" ".3"}) (e "path" #js {"d" "M14.5 11l-3 6v-4h-2l3-6v4h2zM17 3H7v1h10V3m0 17H7v1h10v-1m0-19c1.1 0 2 .9 2 2v18c0 1.1-.9 2-2 2H7c-1.1 0-2-.9-2-2V3c0-1.1.9-2 2-2h10zM7 18h10V6H7v12z"}))
                                                "ChargingStationTwoTone"))
