(ns reagent-mui.icons.south-east
  "Imports @mui/icons-material/SouthEast as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def south-east (create-svg-icon (e "path" #js {"d" "M19 9h-2v6.59L5.41 4 4 5.41 15.59 17H9v2h10V9z"})
                                 "SouthEast"))
