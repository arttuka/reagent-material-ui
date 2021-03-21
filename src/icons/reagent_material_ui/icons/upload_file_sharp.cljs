(ns reagent-material-ui.icons.upload-file-sharp
  "Imports @material-ui/icons/UploadFileSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def upload-file-sharp (create-svg-icon (e "path" #js {"d" "M14 2H4v20h16V8l-6-6zm-1 13v4h-2v-4H8l4.01-4L16 15h-3zm0-6V3.5L18.5 9H13z"})
                                        "UploadFileSharp"))
