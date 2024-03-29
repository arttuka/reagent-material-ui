(ns reagent-mui.icons.drive-file-move-two-tone
  "Imports @mui/icons-material/DriveFileMoveTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def drive-file-move-two-tone (create-svg-icon [(e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 12H4V6h5.17l1.41 1.41.59.59H20v10z"}) (e "path" #js {"d" "M8 14h4v3l4-4-4-4v3H8z"}) (e "path" #js {"d" "M10.59 7.41 9.17 6H4v12h16V8h-8.83l-.58-.59zM12 9l4 4-4 4v-3H8v-2h4V9z", "opacity" ".3"})]
                                               "DriveFileMoveTwoTone"))
