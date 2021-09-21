(ns reagent-mui.icons.label-important-sharp
  "Imports @mui/icons-material/LabelImportantSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def label-important-sharp (create-svg-icon (e "path" #js {"d" "M4 18.99h12.04L21 12l-4.97-7H4l5 7-5 6.99z"})
                                            "LabelImportantSharp"))
