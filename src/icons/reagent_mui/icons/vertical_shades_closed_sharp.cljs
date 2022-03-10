(ns reagent-mui.icons.vertical-shades-closed-sharp
  "Imports @mui/icons-material/VerticalShadesClosedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-shades-closed-sharp (create-svg-icon (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zM13 5h1.5v14H13V5zm-2 14H9.5V5H11v14zM6 5h1.5v14H6V5zm10.5 14V5H18v14h-1.5z"})
                                                   "VerticalShadesClosedSharp"))
