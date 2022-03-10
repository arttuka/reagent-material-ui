(ns reagent-mui.icons.folder-copy-sharp
  "Imports @mui/icons-material/FolderCopySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-copy-sharp (create-svg-icon [(e "path" #js {"d" "M3 6H1v15h19v-2H3z"}) (e "path" #js {"d" "M23 4h-9l-2-2H5.01L5 17h18V4z"})]
                                        "FolderCopySharp"))
