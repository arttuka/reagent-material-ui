(ns reagent-mui.icons.south-east-sharp
  "Imports @mui/icons-material/SouthEastSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def south-east-sharp (create-svg-icon (e "path" #js {"d" "M19 9h-2v6.59L5.41 4 4 5.41 15.59 17H9v2h10V9z"})
                                       "SouthEastSharp"))
