(ns reagent-mui.icons.hive-sharp
  "Imports @mui/icons-material/HiveSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def hive-sharp (create-svg-icon (e "path" #js {"d" "m13.79 8 1.8-3-1.8-3h-3.58l-1.8 3 1.8 3zm-3.58 1-1.8 3 1.8 3h3.58l1.8-3-1.8-3zm6.24 2.51h3.59l1.79-3-1.79-3h-3.59l-1.8 3zm3.59 1h-3.59l-1.8 3 1.8 3h3.59l1.79-3zm-12.49-1 1.8-3-1.8-3H3.96l-1.79 3 1.79 3zm0 1H3.96l-1.79 3 1.79 3h3.59l1.8-3zM10.21 16l-1.8 3 1.8 3h3.58l1.8-3-1.8-3z"})
                                 "HiveSharp"))
