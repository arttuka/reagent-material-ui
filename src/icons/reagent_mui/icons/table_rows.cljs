(ns reagent-mui.icons.table-rows
  "Imports @mui/icons-material/TableRows as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def table-rows (create-svg-icon (e "path" #js {"d" "M21 8H3V4h18v4zm0 2H3v4h18v-4zm0 6H3v4h18v-4z"})
                                 "TableRows"))
