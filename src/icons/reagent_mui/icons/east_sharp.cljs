(ns reagent-mui.icons.east-sharp
  "Imports @mui/icons-material/EastSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def east-sharp (create-svg-icon (e "path" #js {"d" "m15 5-1.41 1.41L18.17 11H2v2h16.17l-4.59 4.59L15 19l7-7-7-7z"})
                                 "EastSharp"))
