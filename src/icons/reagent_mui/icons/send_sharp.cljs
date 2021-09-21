(ns reagent-mui.icons.send-sharp
  "Imports @mui/icons-material/SendSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def send-sharp (create-svg-icon (e "path" #js {"d" "M2.01 21 23 12 2.01 3 2 10l15 2-15 2 .01 7z"})
                                 "SendSharp"))
