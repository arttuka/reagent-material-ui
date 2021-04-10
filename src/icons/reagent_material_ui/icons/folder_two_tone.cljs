(ns reagent-material-ui.icons.folder-two-tone
  "Imports @material-ui/icons/FolderTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def folder-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11.17 8l-.58-.59L9.17 6H4v12h16V8h-8z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 12H4V6h5.17l1.41 1.41.59.59H20v10z"}))
                                      "FolderTwoTone"))
