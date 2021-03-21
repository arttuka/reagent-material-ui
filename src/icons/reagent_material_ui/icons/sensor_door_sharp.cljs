(ns reagent-material-ui.icons.sensor-door-sharp
  "Imports @material-ui/icons/SensorDoorSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sensor-door-sharp (create-svg-icon (e "path" #js {"d" "M20 2H4v20h16V2zm-4.5 11.5c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5z"})
                                        "SensorDoorSharp"))
