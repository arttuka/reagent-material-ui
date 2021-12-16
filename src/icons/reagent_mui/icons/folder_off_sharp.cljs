(ns reagent-mui.icons.folder-off-sharp
  "Imports @mui/icons-material/FolderOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-off-sharp (create-svg-icon (e "path" #js {"d" "m12 6-2-2H6.83L22 19.17V6zM2.1 2.1.69 3.51 2 4.83V20h15.17l3.32 3.31 1.41-1.41z"})
                                       "FolderOffSharp"))
