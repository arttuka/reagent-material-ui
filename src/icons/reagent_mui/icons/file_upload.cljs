(ns reagent-mui.icons.file-upload
  "Imports @mui/icons-material/FileUpload as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def file-upload (create-svg-icon (e "path" #js {"d" "M9 16h6v-6h4l-7-7-7 7h4zm-4 2h14v2H5z"})
                                  "FileUpload"))
