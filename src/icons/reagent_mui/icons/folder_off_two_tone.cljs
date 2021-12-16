(ns reagent-mui.icons.folder-off-two-tone
  "Imports @mui/icons-material/FolderOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-off-two-tone (create-svg-icon [(e "path" #js {"d" "M15.17 18 4 6.83V18zm-4-10L20 17.17V8z", "opacity" ".3"}) (e "path" #js {"d" "m.69 3.51 1.56 1.56c-.15.28-.24.59-.24.93L2 18c0 1.1.9 2 2 2h13.17l3.31 3.31 1.41-1.41L2.1 2.1.69 3.51zM15.17 18H4V6.83L15.17 18zM20 6h-8l-2-2H7.17l4 4H20v9.17l1.76 1.76c.15-.28.24-.59.24-.93V8c0-1.1-.9-2-2-2z"})]
                                          "FolderOffTwoTone"))
