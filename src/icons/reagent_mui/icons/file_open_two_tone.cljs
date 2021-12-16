(ns reagent-mui.icons.file-open-two-tone
  "Imports @mui/icons-material/FileOpenTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def file-open-two-tone (create-svg-icon [(e "path" #js {"d" "M15 14h3V9h-5V4H6v16h9z", "opacity" ".3"}) (e "path" #js {"d" "M15 22H6c-1.1 0-2-.9-2-2V4c0-1.1.9-2 2-2h8l6 6v6h-2V9h-5V4H6v16h9v2zm4-.34v-2.24l2.95 2.95 1.41-1.41L20.41 18h2.24v-2H17v5.66h2z"})]
                                         "FileOpenTwoTone"))
