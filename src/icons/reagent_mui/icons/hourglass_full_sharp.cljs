(ns reagent-mui.icons.hourglass-full-sharp
  "Imports @mui/icons-material/HourglassFullSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hourglass-full-sharp (create-svg-icon (e "path" #js {"d" "M6 2v6h.01L6 8.01 10 12l-4 4 .01.01H6V22h12v-5.99h-.01L18 16l-4-4 4-3.99-.01-.01H18V2H6z"})
                                           "HourglassFullSharp"))
