(ns reagent-mui.icons.filter-4-sharp
  "Imports @mui/icons-material/Filter4Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-4-sharp (create-svg-icon (e "path" #js {"d" "M3 5H1v18h18v-2H3V5zm12 10h2V5h-2v4h-2V5h-2v6h4v4zm8-14H5v18h18V1zm-2 16H7V3h14v14z"})
                                     "Filter4Sharp"))
