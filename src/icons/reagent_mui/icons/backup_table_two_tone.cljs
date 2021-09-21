(ns reagent-mui.icons.backup-table-two-tone
  "Imports @mui/icons-material/BackupTableTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def backup-table-two-tone (create-svg-icon [(e "path" #js {"d" "M11 11h5v5h-5zm-7 0h5v5H4zm0-7h12v5H4z", "opacity" ".3"}) (e "path" #js {"d" "M20 6v14H6v2h14c1.1 0 2-.9 2-2V6h-2z"}) (e "path" #js {"d" "M18 16V4c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2zM4 4h12v5H4V4zm5 12H4v-5h5v5zm2-5h5v5h-5v-5z"})]
                                            "BackupTableTwoTone"))
