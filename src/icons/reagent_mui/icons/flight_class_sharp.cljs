(ns reagent-mui.icons.flight-class-sharp
  "Imports @mui/icons-material/FlightClassSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flight-class-sharp (create-svg-icon (e "path" #js {"d" "M18 4h-6v9h6V4zM9.5 16H18v2H8L5 8V4h2v4l2.5 8zM8 19h10v2H8v-2z"})
                                         "FlightClassSharp"))
