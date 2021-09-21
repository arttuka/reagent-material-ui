(ns reagent-mui.icons.electric-car-outlined
  "Imports @mui/icons-material/ElectricCarOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def electric-car-outlined (create-svg-icon [(e "path" #js {"d" "M18.92 2.01C18.72 1.42 18.16 1 17.5 1h-11c-.66 0-1.21.42-1.42 1.01L3 8v8c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h12v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1V8l-2.08-5.99zM6.85 3h10.29l1.08 3.11H5.77L6.85 3zM19 13H5V8h14v5z"}) (e "circle" #js {"cx" "7.5", "cy" "10.5", "r" "1.5"}) (e "circle" #js {"cx" "16.5", "cy" "10.5", "r" "1.5"}) (e "path" #js {"d" "M7 20h4v-2l6 3h-4v2z"})]
                                            "ElectricCarOutlined"))
