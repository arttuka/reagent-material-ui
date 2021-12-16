(ns reagent-mui.icons.folder-zip-sharp
  "Imports @mui/icons-material/FolderZipSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-zip-sharp (create-svg-icon (e "path" #js {"d" "m12 6-2-2H2v16h20V6H12zm6 6h-2v2h2v2h-2v2h-2v-2h2v-2h-2v-2h2v-2h-2V8h2v2h2v2z"})
                                       "FolderZipSharp"))
