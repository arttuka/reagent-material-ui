(ns reagent-mui.icons.folder-open-sharp
  "Imports @mui/icons-material/FolderOpenSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-open-sharp (create-svg-icon (e "path" #js {"d" "M22 6H12l-2-2H2v16h20V6zm-2 12H4V8h16v10z"})
                                        "FolderOpenSharp"))
