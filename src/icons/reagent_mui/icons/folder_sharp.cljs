(ns reagent-mui.icons.folder-sharp
  "Imports @mui/icons-material/FolderSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-sharp (create-svg-icon (e "path" #js {"d" "M10 4H2v16h20V6H12l-2-2z"})
                                   "FolderSharp"))
