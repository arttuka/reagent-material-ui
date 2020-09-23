(ns reagent-material-ui.icons.table-rows-two-tone
  "Imports @material-ui/icons/TableRowsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def table-rows-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 4v4H4V4h16zm0 6v4H4v-4h16zM4 20v-4h16v4H4z", "opacity" ".3"}) (e "path" #js {"d" "M2 2v20h20V2H2zm18 2v4H4V4h16zm0 6v4H4v-4h16zM4 20v-4h16v4H4z"}))
                                          "TableRowsTwoTone"))
