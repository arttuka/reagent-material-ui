(ns reagent-mui.icons.elevator-sharp
  "Imports @mui/icons-material/ElevatorSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def elevator-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM8.5 6c.69 0 1.25.56 1.25 1.25S9.19 8.5 8.5 8.5s-1.25-.56-1.25-1.25S7.81 6 8.5 6zm2.5 8h-1v4H7v-4H6V9.5h5V14zm4.5 3L13 13h5l-2.5 4zM13 11l2.5-4 2.5 4h-5z"})
                                     "ElevatorSharp"))
