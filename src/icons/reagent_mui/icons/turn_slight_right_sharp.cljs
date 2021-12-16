(ns reagent-mui.icons.turn-slight-right-sharp
  "Imports @mui/icons-material/TurnSlightRightSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-slight-right-sharp (create-svg-icon (e "path" #js {"d" "M12.34 6V4H18v5.66h-2V7.41l-5 5V20H9v-8.41L14.59 6z"})
                                              "TurnSlightRightSharp"))
