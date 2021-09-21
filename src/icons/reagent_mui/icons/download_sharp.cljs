(ns reagent-mui.icons.download-sharp
  "Imports @mui/icons-material/DownloadSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def download-sharp (create-svg-icon (e "path" #js {"d" "M19 9h-4V3H9v6H5l7 7 7-7zM5 18v2h14v-2H5z"})
                                     "DownloadSharp"))
