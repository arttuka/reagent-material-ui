(ns reagent-mui.icons.upload-file-two-tone
  "Imports @mui/icons-material/UploadFileTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def upload-file-two-tone (create-svg-icon [(e "path" #js {"d" "M13 4H6v16h12V9h-5V4zm3 11h-3v4h-2v-4H8l4.01-4L16 15z", "opacity" ".3"}) (e "path" #js {"d" "M14 2H6c-1.1 0-1.99.9-1.99 2L4 20c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2V8l-6-6zm4 18H6V4h7v5h5v11z"}) (e "path" #js {"d" "M8 15h3v4h2v-4h3l-3.99-4z"})]
                                           "UploadFileTwoTone"))
