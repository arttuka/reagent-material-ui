(ns reagent-material-ui.icons.table-rows
  "Imports @material-ui/icons/TableRows as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def table-rows (create-svg-icon (e "path" #js {"d" "M21 8H3V4h18v4zm0 2H3v4h18v-4zm0 6H3v4h18v-4z"})
                                 "TableRows"))
