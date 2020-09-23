(ns reagent-material-ui.icons.backup-table-rounded
  "Imports @material-ui/icons/BackupTableRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def backup-table-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 7v12c0 .55-.45 1-1 1H7c-.55 0-1 .45-1 1s.45 1 1 1h13c1.1 0 2-.9 2-2V7c0-.55-.45-1-1-1s-1 .45-1 1z"}) (e "path" #js {"d" "M16 2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zM9 16H4v-5h5v5zm7 0h-5v-5h5v5zm0-7H4V4h12v5z"}))
                                           "BackupTableRounded"))
