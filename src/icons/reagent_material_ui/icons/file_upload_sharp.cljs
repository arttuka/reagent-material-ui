(ns reagent-material-ui.icons.file-upload-sharp
  "Imports @material-ui/icons/FileUploadSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def file-upload-sharp (create-svg-icon (e "path" #js {"d" "M5 10h4v6h6v-6h4l-7-7-7 7zm0 8v2h14v-2H5z"})
                                        "FileUploadSharp"))
