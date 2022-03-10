(ns reagent-mui.icons.battery-6-bar-sharp
  "Imports @mui/icons-material/Battery6BarSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def battery-6-bar-sharp (create-svg-icon (e "path" #js {"d" "M17 4v18H7V4h3V2h4v2h3zm-2 2H9v2h6V6z"})
                                          "Battery6BarSharp"))
