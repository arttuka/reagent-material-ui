(ns reagent-material-ui.icons.charging-station-sharp
  "Imports @material-ui/icons/ChargingStationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def charging-station-sharp (create-svg-icon (e "path" #js {"d" "M14.5 11l-3 6v-4h-2l3-6v4h2zM5 1h14v22H5V1zm2 5v12h10V6H7z"})
                                             "ChargingStationSharp"))
