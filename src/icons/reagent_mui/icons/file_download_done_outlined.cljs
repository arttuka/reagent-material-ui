(ns reagent-mui.icons.file-download-done-outlined
  "Imports @mui/icons-material/FileDownloadDoneOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def file-download-done-outlined (create-svg-icon (e "path" #js {"d" "M20.13 5.41 18.72 4l-9.19 9.19-4.25-4.24-1.41 1.41 5.66 5.66zM5 18h14v2H5z"})
                                                  "FileDownloadDoneOutlined"))
