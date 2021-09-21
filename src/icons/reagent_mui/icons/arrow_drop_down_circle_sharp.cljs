(ns reagent-mui.icons.arrow-drop-down-circle-sharp
  "Imports @mui/icons-material/ArrowDropDownCircleSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-drop-down-circle-sharp (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 13-4-4h8l-4 4z"})
                                                   "ArrowDropDownCircleSharp"))
