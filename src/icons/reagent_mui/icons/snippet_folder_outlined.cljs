(ns reagent-mui.icons.snippet-folder-outlined
  "Imports @mui/icons-material/SnippetFolderOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def snippet-folder-outlined (create-svg-icon (e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 12H4V6h5.17l2 2H20v10zm-2.5-5.88v3.38h-3v-5h1.38l1.62 1.62zM13 9v8h6v-5.5L16.5 9H13z"})
                                              "SnippetFolderOutlined"))
