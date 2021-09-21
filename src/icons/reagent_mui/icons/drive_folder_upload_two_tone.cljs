(ns reagent-mui.icons.drive-folder-upload-two-tone
  "Imports @mui/icons-material/DriveFolderUploadTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def drive-folder-upload-two-tone (create-svg-icon [(e "path" #js {"d" "M9.17 6H4v12h16V8h-8.83l-2-2zM16 13h-3v4h-2v-4H8l4.01-4L16 13z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 12H4V6h5.17l2 2H20v10z"}) (e "path" #js {"d" "M11 13v4h2v-4h3l-3.99-4L8 13z"})]
                                                   "DriveFolderUploadTwoTone"))
