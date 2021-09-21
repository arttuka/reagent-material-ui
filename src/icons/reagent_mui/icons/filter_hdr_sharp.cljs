(ns reagent-mui.icons.filter-hdr-sharp
  "Imports @mui/icons-material/FilterHdrSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-hdr-sharp (create-svg-icon (e "path" #js {"d" "m14 6-3.75 5 2.85 3.8-1.6 1.2C9.81 13.75 7 10 7 10l-6 8h22L14 6z"})
                                       "FilterHdrSharp"))
