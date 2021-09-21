(ns reagent-mui.icons.sensor-door-two-tone
  "Imports @mui/icons-material/SensorDoorTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sensor-door-two-tone (create-svg-icon [(e "path" #js {"d" "M18 4v16H6V4h12m-2.5 6.5c-.83 0-1.5.67-1.5 1.5s.67 1.5 1.5 1.5S17 12.83 17 12s-.67-1.5-1.5-1.5z", "opacity" ".3"}) (e "path" #js {"d" "M18 4v16H6V4h12m0-2H6c-1.1 0-2 .9-2 2v18h16V4c0-1.1-.9-2-2-2zm-2.5 8.5c-.83 0-1.5.67-1.5 1.5s.67 1.5 1.5 1.5S17 12.83 17 12s-.67-1.5-1.5-1.5z"})]
                                           "SensorDoorTwoTone"))
