(ns reagent-mui.icons.square-sharp
  "Imports @mui/icons-material/SquareSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def square-sharp (create-svg-icon (e "path" #js {"d" "M3 3h18v18H3z"})
                                   "SquareSharp"))
