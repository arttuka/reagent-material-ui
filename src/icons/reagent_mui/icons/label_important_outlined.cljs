(ns reagent-mui.icons.label-important-outlined
  "Imports @mui/icons-material/LabelImportantOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def label-important-outlined (create-svg-icon (e "path" #js {"d" "M4 18.99h11c.67 0 1.27-.32 1.63-.83L21 12l-4.37-6.16C16.27 5.33 15.67 5 15 5H4l5 7-5 6.99z"})
                                               "LabelImportantOutlined"))
