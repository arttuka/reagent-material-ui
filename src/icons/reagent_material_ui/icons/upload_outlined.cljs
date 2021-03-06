(ns reagent-material-ui.icons.upload-outlined
  "Imports @material-ui/icons/UploadOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def upload-outlined (create-svg-icon (e "path" #js {"d" "M9 16h6v-6h4l-7-7-7 7h4v6zm3-10.17L14.17 8H13v6h-2V8H9.83L12 5.83zM5 18h14v2H5z"})
                                      "UploadOutlined"))
