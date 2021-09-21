(ns reagent-mui.icons.west-sharp
  "Imports @mui/icons-material/WestSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def west-sharp (create-svg-icon (e "path" #js {"d" "m9 19 1.41-1.41L5.83 13H22v-2H5.83l4.59-4.59L9 5l-7 7 7 7z"})
                                 "WestSharp"))
