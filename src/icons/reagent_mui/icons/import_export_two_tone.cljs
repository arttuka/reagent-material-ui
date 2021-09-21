(ns reagent-mui.icons.import-export-two-tone
  "Imports @mui/icons-material/ImportExportTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def import-export-two-tone (create-svg-icon (e "path" #js {"d" "M5 6.99h3V14h2V6.99h3L9 3zM14 10v7.01h-3L15 21l4-3.99h-3V10z"})
                                             "ImportExportTwoTone"))
