(ns reagent-material-ui.icons.file-download-off-outlined
  "Imports @material-ui/icons/FileDownloadOffOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def file-download-off-outlined (create-svg-icon (e "path" #js {"d" "M18 15.17V15h2v2.17l-2-2zm-2.59-2.58L17 11l-1.41-1.41L14 11.17l1.41 1.42zM13 10.17V4h-2v4.17l2 2zm8.19 11.02l-1.78-1.78-16.6-16.6-1.42 1.41 6.19 6.19L7 11l5 5 .59-.59L15.17 18H6v-3H4v3c0 1.1.9 2 2 2h11.17l2.61 2.61 1.41-1.42z"})
                                                 "FileDownloadOffOutlined"))
