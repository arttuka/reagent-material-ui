(ns reagent-mui.icons.arrow-upward-sharp
  "Imports @mui/icons-material/ArrowUpwardSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-upward-sharp (create-svg-icon (e "path" #js {"d" "m4 12 1.41 1.41L11 7.83V20h2V7.83l5.58 5.59L20 12l-8-8-8 8z"})
                                         "ArrowUpwardSharp"))
