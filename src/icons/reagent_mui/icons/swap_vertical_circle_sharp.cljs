(ns reagent-mui.icons.swap-vertical-circle-sharp
  "Imports @mui/icons-material/SwapVerticalCircleSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swap-vertical-circle-sharp (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zM6.5 9 10 5.5 13.5 9H11v4H9V9H6.5zm7.5 9.5L10.5 15H13v-4h2v4h2.5L14 18.5z"})
                                                 "SwapVerticalCircleSharp"))
