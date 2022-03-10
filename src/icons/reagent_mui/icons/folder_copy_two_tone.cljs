(ns reagent-mui.icons.folder-copy-two-tone
  "Imports @mui/icons-material/FolderCopyTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-copy-two-tone (create-svg-icon [(e "path" #js {"d" "M11.17 4H7v11h14V6h-7.83z", "opacity" ".3"}) (e "path" #js {"d" "M21 4h-7l-2-2H7c-1.1 0-1.99.9-1.99 2L5 15c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 11H7V4h4.17l2 2H21v9z"}) (e "path" #js {"d" "M3 6H1v13c0 1.1.9 2 2 2h17v-2H3V6z"})]
                                           "FolderCopyTwoTone"))
