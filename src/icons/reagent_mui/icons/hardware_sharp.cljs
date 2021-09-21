(ns reagent-mui.icons.hardware-sharp
  "Imports @mui/icons-material/HardwareSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hardware-sharp (create-svg-icon (e "path" #js {"d" "m18 3-3 3V3H9C6.24 3 4 5.24 4 8h5v3h6V8l3 3h2V3h-2zM9 13v8h6v-8H9z"})
                                     "HardwareSharp"))
