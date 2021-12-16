(ns reagent-mui.icons.folder-zip-two-tone
  "Imports @mui/icons-material/FolderZipTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-zip-two-tone (create-svg-icon [(e "path" #js {"d" "M16 16h2v-2h-2v-2h2v-2h-2V8h4v10h-4v-2zm0 0h-2v2H4V6h5.17l2 2H14v2h2v2h-2v2h2v2z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm-4 10h2v-2h-2v-2h2v-2h-2V8h4v10h-4v-2zm0 0h-2v2H4V6h5.17l2 2H14v2h2v2h-2v2h2v2z"})]
                                          "FolderZipTwoTone"))
