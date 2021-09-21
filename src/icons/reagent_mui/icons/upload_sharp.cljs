(ns reagent-mui.icons.upload-sharp
  "Imports @mui/icons-material/UploadSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def upload-sharp (create-svg-icon (e "path" #js {"d" "M9 16h6v-6h4l-7-7-7 7h4v6zm-4 2h14v2H5v-2z"})
                                   "UploadSharp"))
