(ns reagent-mui.icons.download
  "Imports @mui/icons-material/Download as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def download (create-svg-icon (e "path" #js {"d" "M5 20h14v-2H5v2zM19 9h-4V3H9v6H5l7 7 7-7z"})
                               "Download"))
