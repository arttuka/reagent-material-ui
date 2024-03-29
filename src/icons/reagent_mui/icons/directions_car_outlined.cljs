(ns reagent-mui.icons.directions-car-outlined
  "Imports @mui/icons-material/DirectionsCarOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def directions-car-outlined (create-svg-icon [(e "path" #js {"d" "M18.92 6.01C18.72 5.42 18.16 5 17.5 5h-11c-.66 0-1.21.42-1.42 1.01L3 12v8c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h12v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-8l-2.08-5.99zM6.85 7h10.29l1.08 3.11H5.77L6.85 7zM19 17H5v-5h14v5z"}) (e "circle" #js {"cx" "7.5", "cy" "14.5", "r" "1.5"}) (e "circle" #js {"cx" "16.5", "cy" "14.5", "r" "1.5"})]
                                              "DirectionsCarOutlined"))
