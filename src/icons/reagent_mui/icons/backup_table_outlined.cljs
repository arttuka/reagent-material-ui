(ns reagent-mui.icons.backup-table-outlined
  "Imports @mui/icons-material/BackupTableOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def backup-table-outlined (create-svg-icon [(e "path" #js {"d" "M20 6v14H6v2h14c1.1 0 2-.9 2-2V6h-2z"}) (e "path" #js {"d" "M16 2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zM9 16H4v-5h5v5zm7 0h-5v-5h5v5zm0-7H4V4h12v5z"})]
                                            "BackupTableOutlined"))
