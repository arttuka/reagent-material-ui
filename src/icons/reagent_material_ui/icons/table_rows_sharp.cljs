(ns reagent-material-ui.icons.table-rows-sharp
  "Imports @material-ui/icons/TableRowsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def table-rows-sharp (create-svg-icon (e "path" #js {"d" "M22 7H2V2h20v5zm0 2.5H2v5h20v-5zm0 7.5H2v5h20v-5z"})
                                       "TableRowsSharp"))
