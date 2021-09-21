(ns reagent-mui.icons.upload
  "Imports @mui/icons-material/Upload as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def upload (create-svg-icon (e "path" #js {"d" "M5 20h14v-2H5v2zm0-10h4v6h6v-6h4l-7-7-7 7z"})
                             "Upload"))
