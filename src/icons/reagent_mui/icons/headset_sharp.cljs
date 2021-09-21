(ns reagent-mui.icons.headset-sharp
  "Imports @mui/icons-material/HeadsetSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def headset-sharp (create-svg-icon (e "path" #js {"d" "M11.4 1.02C6.62 1.33 3 5.52 3 10.31V20h6v-8H5v-1.71C5 6.45 7.96 3.11 11.79 3 15.76 2.89 19 6.06 19 10v2h-4v8h6V10c0-5.17-4.36-9.32-9.6-8.98z"})
                                    "HeadsetSharp"))
