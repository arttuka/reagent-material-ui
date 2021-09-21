(ns reagent-mui.icons.file-upload-sharp
  "Imports @mui/icons-material/FileUploadSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def file-upload-sharp (create-svg-icon (e "path" #js {"d" "M5 10h4v6h6v-6h4l-7-7-7 7zm0 8v2h14v-2H5z"})
                                        "FileUploadSharp"))
