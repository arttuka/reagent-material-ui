(ns reagent-material-ui.icons.table-rows-outlined
  "Imports @material-ui/icons/TableRowsOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def table-rows-outlined (create-svg-icon (e "path" #js {"d" "M22 2H2v20h20V2zM4 8V4h16v4H4zm0 6v-4h16v4H4zm0 6v-4h16v4H4z"})
                                          "TableRowsOutlined"))
