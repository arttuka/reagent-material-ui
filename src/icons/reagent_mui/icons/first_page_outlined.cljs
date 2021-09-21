(ns reagent-mui.icons.first-page-outlined
  "Imports @mui/icons-material/FirstPageOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def first-page-outlined (create-svg-icon (e "path" #js {"d" "M18.41 16.59 13.82 12l4.59-4.59L17 6l-6 6 6 6 1.41-1.41zM6 6h2v12H6V6z"})
                                          "FirstPageOutlined"))
