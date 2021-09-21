(ns reagent-mui.icons.file-download-two-tone
  "Imports @mui/icons-material/FileDownloadTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def file-download-two-tone (create-svg-icon [(e "path" #js {"d" "M14.17 11H13V5h-2v6H9.83L12 13.17z", "opacity" ".3"}) (e "path" #js {"d" "M5 18h14v2H5zm14-9h-4V3H9v6H5l7 7 7-7zm-8 2V5h2v6h1.17L12 13.17 9.83 11H11z"})]
                                             "FileDownloadTwoTone"))
