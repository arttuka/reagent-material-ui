(ns reagent-material-ui.icons.battery-std-rounded
  "Imports @material-ui/icons/BatteryStdRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-std-rounded (create-svg-icon (e "path" #js {"d" "M16 4h-2V3c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v1H8c-.55 0-1 .45-1 1v16c0 .55.45 1 1 1h8c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1z"})
                                          "BatteryStdRounded"))
