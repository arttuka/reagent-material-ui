(ns reagent-mui.icons.file-download-off-two-tone
  "Imports @mui/icons-material/FileDownloadOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def file-download-off-two-tone (create-svg-icon [(e "path" #js {"d" "M13 5h-2v3.17l2 2z", "opacity" ".3"}) (e "path" #js {"d" "m11 8.17-2-2V3h6v6h4l-3.59 3.59L13 10.17V5h-2v3.17zm10.19 13.02L2.81 2.81 1.39 4.22 6.17 9H5l7 7 .59-.59L15.17 18H5v2h12.17l2.61 2.61 1.41-1.42z"})]
                                                 "FileDownloadOffTwoTone"))
