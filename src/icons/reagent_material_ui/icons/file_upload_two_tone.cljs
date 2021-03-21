(ns reagent-material-ui.icons.file-upload-two-tone
  "Imports @material-ui/icons/FileUploadTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def file-upload-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9.83 8H11v6h2V8h1.17L12 5.83z", "opacity" ".3"}) (e "path" #js {"d" "M5 18h14v2H5zm0-8h4v6h6v-6h4l-7-7-7 7zm8-2v6h-2V8H9.83L12 5.83 14.17 8H13z"}))
                                           "FileUploadTwoTone"))
