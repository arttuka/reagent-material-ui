(ns reagent-material-ui.icons.sensor-window-sharp
  "Imports @material-ui/icons/SensorWindowSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sensor-window-sharp (create-svg-icon (e "path" #js {"d" "M18 4v16H6V4h12M4 2v20h16V2H4zm3 17h10v-6H7v6zm3-9h4v1h3V5H7v6h3v-1z"})
                                          "SensorWindowSharp"))
