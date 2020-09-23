(ns reagent-material-ui.icons.sensor-window-rounded
  "Imports @material-ui/icons/SensorWindowRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sensor-window-rounded (create-svg-icon (e "path" #js {"d" "M18 4v16H6V4h12m0-2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zM7 19h10v-6H7v6zm3-9h4v1h3V5H7v6h3v-1z"})
                                            "SensorWindowRounded"))
