(ns reagent-mui.icons.bluetooth-rounded
  "Imports @mui/icons-material/BluetoothRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def bluetooth-rounded (create-svg-icon (e "path" #js {"d" "m17 7-4.29-4.29c-.63-.63-1.71-.19-1.71.7v6.18L7.11 5.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L10.59 12 5.7 16.89c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L11 14.41v6.18c0 .89 1.08 1.34 1.71.71L17 17c.39-.39.39-1.02 0-1.41L13.41 12 17 8.42c.39-.39.39-1.03 0-1.42zm-4-1.17 1.88 1.88L13 9.59V5.83zm1.88 10.46L13 18.17v-3.76l1.88 1.88z"})
                                        "BluetoothRounded"))
