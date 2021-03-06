(ns reagent-material-ui.icons.table-rows-sharp
  "Imports @material-ui/icons/TableRowsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def table-rows-sharp (create-svg-icon (e "path" #js {"d" "M21 8H3V4h18v4zm0 2H3v4h18v-4zm0 6H3v4h18v-4z"})
                                       "TableRowsSharp"))
