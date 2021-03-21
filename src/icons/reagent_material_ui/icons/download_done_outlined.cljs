(ns reagent-material-ui.icons.download-done-outlined
  "Imports @material-ui/icons/DownloadDoneOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def download-done-outlined (create-svg-icon (e "path" #js {"d" "M5 18h14v2H5v-2zm4.6-2.7L5 10.7l2-1.9 2.6 2.6L17 4l2 2-9.4 9.3z"})
                                             "DownloadDoneOutlined"))
