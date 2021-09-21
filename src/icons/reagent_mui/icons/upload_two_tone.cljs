(ns reagent-mui.icons.upload-two-tone
  "Imports @mui/icons-material/UploadTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def upload-two-tone (create-svg-icon [(e "path" #js {"d" "M9.83 8H11v6h2V8h1.17L12 5.83z", "opacity" ".3"}) (e "path" #js {"d" "m12 3-7 7h4v6h6v-6h4l-7-7zm1 5v6h-2V8H9.83L12 5.83 14.17 8H13zM5 18h14v2H5z"})]
                                      "UploadTwoTone"))
