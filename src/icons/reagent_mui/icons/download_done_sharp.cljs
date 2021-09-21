(ns reagent-mui.icons.download-done-sharp
  "Imports @mui/icons-material/DownloadDoneSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def download-done-sharp (create-svg-icon (e "path" #js {"d" "M5 18h14v2H5v-2zm4.6-2.7L5 10.7l2-1.9 2.6 2.6L17 4l2 2-9.4 9.3z"})
                                          "DownloadDoneSharp"))
