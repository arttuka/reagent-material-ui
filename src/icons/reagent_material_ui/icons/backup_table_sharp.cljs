(ns reagent-material-ui.icons.backup-table-sharp
  "Imports @material-ui/icons/BackupTableSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def backup-table-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 6v14H6v2h16V6z"}) (e "path" #js {"d" "M18 2H2v16h16V2zM9 16H4v-5h5v5zm7 0h-5v-5h5v5zm0-7H4V4h12v5z"}))
                                         "BackupTableSharp"))
