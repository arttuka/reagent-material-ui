(ns reagent-material-ui.icons.insert-drive-file-sharp
  "Imports @material-ui/icons/InsertDriveFileSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def insert-drive-file-sharp (create-svg-icon (e "path" #js {"d" "M4.01 2 4 22h16V8l-6-6H4.01zM13 9V3.5L18.5 9H13z"})
                                              "InsertDriveFileSharp"))
