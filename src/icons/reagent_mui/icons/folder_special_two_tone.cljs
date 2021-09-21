(ns reagent-mui.icons.folder-special-two-tone
  "Imports @mui/icons-material/FolderSpecialTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def folder-special-two-tone (create-svg-icon [(e "path" #js {"d" "m11.17 8-2-2H4v12h16V8h-8.83zM15 9l1.19 2.79 3.03.26-2.3 1.99.69 2.96L15 15.47 12.39 17l.69-2.96-2.3-1.99 3.03-.26L15 9z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 12H4V6h5.17l2 2H20v10zm-6.92-3.96L12.39 17 15 15.47 17.61 17l-.69-2.96 2.3-1.99-3.03-.26L15 9l-1.19 2.79-3.03.26z"})]
                                              "FolderSpecialTwoTone"))
