(ns reagent-mui.icons.arrow-downward-outlined
  "Imports @mui/icons-material/ArrowDownwardOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-downward-outlined (create-svg-icon (e "path" #js {"d" "m20 12-1.41-1.41L13 16.17V4h-2v12.17l-5.58-5.59L4 12l8 8 8-8z"})
                                              "ArrowDownwardOutlined"))
