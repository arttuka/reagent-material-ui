(ns reagent-mui.icons.filter-b-and-w-sharp
  "Imports @mui/icons-material/FilterBAndWSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-b-and-w-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-2 16-7-8v8H5l7-8V5h7v14z"})
                                           "FilterBAndWSharp"))
