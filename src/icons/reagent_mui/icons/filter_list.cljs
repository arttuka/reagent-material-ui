(ns reagent-mui.icons.filter-list
  "Imports @mui/icons-material/FilterList as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-list (create-svg-icon (e "path" #js {"d" "M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z"})
                                  "FilterList"))
