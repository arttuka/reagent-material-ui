(ns reagent-mui.icons.folder-copy
  "Imports @mui/icons-material/FolderCopy as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-copy (create-svg-icon [(e "path" #js {"d" "M3 6H1v13c0 1.1.9 2 2 2h17v-2H3V6z"}) (e "path" #js {"d" "M21 4h-7l-2-2H7c-1.1 0-1.99.9-1.99 2L5 15c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2z"})]
                                  "FolderCopy"))
