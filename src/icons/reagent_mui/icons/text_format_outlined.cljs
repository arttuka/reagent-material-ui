(ns reagent-mui.icons.text-format-outlined
  "Imports @mui/icons-material/TextFormatOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def text-format-outlined (create-svg-icon (e "path" #js {"d" "M5 17v2h14v-2H5zm4.5-4.2h5l.9 2.2h2.1L12.75 4h-1.5L6.5 15h2.1l.9-2.2zM12 5.98 13.87 11h-3.74L12 5.98z"})
                                           "TextFormatOutlined"))
