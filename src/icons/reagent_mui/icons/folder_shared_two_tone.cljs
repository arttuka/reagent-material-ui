(ns reagent-mui.icons.folder-shared-two-tone
  "Imports @mui/icons-material/FolderSharedTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-shared-two-tone (create-svg-icon [(e "path" #js {"d" "m11.17 8-.59-.59L9.17 6H4v12h16V8h-8.83zM19 16v1h-8v-1c0-1.33 2.67-2 4-2s4 .67 4 2zm-4-7c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 12H4V6h5.17l2 2H20v10zm-5-5c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm-4 3v1h8v-1c0-1.33-2.67-2-4-2s-4 .67-4 2z"})]
                                             "FolderSharedTwoTone"))
