(ns reagent-mui.icons.insert-drive-file-sharp
  "Imports @mui/icons-material/InsertDriveFileSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def insert-drive-file-sharp (create-svg-icon (e "path" #js {"d" "M4.01 2 4 22h16V8l-6-6H4.01zM13 9V3.5L18.5 9H13z"})
                                              "InsertDriveFileSharp"))
