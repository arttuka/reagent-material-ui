(ns reagent-mui.icons.folder-delete
  "Imports @mui/icons-material/FolderDelete as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-delete (create-svg-icon (e "path" #js {"d" "M22 8v10c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2l.01-12c0-1.1.89-2 1.99-2h6l2 2h8c1.1 0 2 .9 2 2zm-5.5 2V9h-2v1H12v1.5h1v4c0 .83.67 1.5 1.5 1.5h2c.83 0 1.5-.67 1.5-1.5v-4h1V10h-2.5zm0 5.5h-2v-4h2v4z"})
                                    "FolderDelete"))
