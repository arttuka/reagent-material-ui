(ns reagent-mui.icons.filter-alt-off-sharp
  "Imports @mui/icons-material/FilterAltOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-alt-off-sharp (create-svg-icon (e "path" #js {"d" "M21.05 4H6.83l7.97 7.97zM2.81 2.81 1.39 4.22 10 13v7h4v-3.17l5.78 5.78 1.41-1.42z"})
                                           "FilterAltOffSharp"))
