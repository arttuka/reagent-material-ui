(ns reagent-mui.icons.label-off-sharp
  "Imports @mui/icons-material/LabelOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def label-off-sharp (create-svg-icon (e "path" #js {"d" "m22 12-4.97-7H8.66l10.7 10.73zM2 4l1 1v14h14l2 2 1.41-1.41L3.44 2.62z"})
                                      "LabelOffSharp"))
