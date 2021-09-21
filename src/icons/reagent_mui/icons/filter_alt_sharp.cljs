(ns reagent-mui.icons.filter-alt-sharp
  "Imports @mui/icons-material/FilterAltSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-alt-sharp (create-svg-icon (e "path" #js {"d" "M3 4c2.01 2.59 7 9 7 9v7h4v-7s4.98-6.41 7-9H3z"})
                                       "FilterAltSharp"))
