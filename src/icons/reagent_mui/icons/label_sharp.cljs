(ns reagent-mui.icons.label-sharp
  "Imports @mui/icons-material/LabelSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def label-sharp (create-svg-icon (e "path" #js {"d" "M17.03 5 3 5.01v13.98l14.03.01L22 12l-4.97-7z"})
                                  "LabelSharp"))
