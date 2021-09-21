(ns reagent-mui.icons.import-export-outlined
  "Imports @mui/icons-material/ImportExportOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def import-export-outlined (create-svg-icon (e "path" #js {"d" "M9 3 5 6.99h3V14h2V6.99h3L9 3zm7 14.01V10h-2v7.01h-3L15 21l4-3.99h-3z"})
                                             "ImportExportOutlined"))
