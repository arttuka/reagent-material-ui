(ns reagent-mui.icons.hourglass-bottom-sharp
  "Imports @mui/icons-material/HourglassBottomSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hourglass-bottom-sharp (create-svg-icon (e "path" #js {"d" "m18 22-.01-6L14 12l3.99-4.01L18 2H6v6l4 4-4 3.99V22h12zM8 7.5V4h8v3.5l-4 4-4-4z"})
                                             "HourglassBottomSharp"))
