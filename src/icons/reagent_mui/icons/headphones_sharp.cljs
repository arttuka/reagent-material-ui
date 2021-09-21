(ns reagent-mui.icons.headphones-sharp
  "Imports @mui/icons-material/HeadphonesSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def headphones-sharp (create-svg-icon (e "path" #js {"d" "M12 3c-4.97 0-9 4.03-9 9v9h6v-8H5v-1c0-3.87 3.13-7 7-7s7 3.13 7 7v1h-4v8h6v-9c0-4.97-4.03-9-9-9z"})
                                       "HeadphonesSharp"))
