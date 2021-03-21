(ns reagent-material-ui.icons.sensor-window-two-tone
  "Imports @material-ui/icons/SensorWindowTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sensor-window-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 4v7h-4v-1h-4v1H6V4h12zM6 20v-7h12v7H6z", "opacity" ".3"}) (e "path" #js {"d" "M18 2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 2v7h-4v-1h-4v1H6V4h12zM6 20v-7h12v7H6z"}))
                                             "SensorWindowTwoTone"))
