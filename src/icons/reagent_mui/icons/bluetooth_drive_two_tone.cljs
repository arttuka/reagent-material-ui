(ns reagent-mui.icons.bluetooth-drive-two-tone
  "Imports @mui/icons-material/BluetoothDriveTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bluetooth-drive-two-tone (create-svg-icon [(e "path" #js {"d" "M4 17h14v-5H4v5zm11.5-4c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zm-9 0c.83 0 1.5.67 1.5 1.5S7.33 16 6.5 16 5 15.33 5 14.5 5.67 13 6.5 13z", "opacity" ".3"}) (e "path" #js {"d" "M18 17H4v-5h13c-1.1 0-2-.9-2-2H4.81l1.04-3H15V5H5.5c-.66 0-1.21.42-1.42 1.01L2 12v8c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-1h12v1c0 .55.45 1 1 1h1c.55 0 1-.45 1-1v-8h-2v5z"}) (e "circle" #js {"cx" "6.5", "cy" "14.5", "r" "1.5"}) (e "circle" #js {"cx" "15.5", "cy" "14.5", "r" "1.5"}) (e "path" #js {"d" "M22 3.85 19.15 1h-.5v3.79l-2.3-2.29-.7.7L18.44 6l-2.79 2.79.7.71 2.3-2.3V11h.5L22 8.14 19.85 6 22 3.85zm-2.35-.94.94.94-.94.94V2.91zm.94 5.23-.94.94V7.2l.94.94z"})]
                                               "BluetoothDriveTwoTone"))
