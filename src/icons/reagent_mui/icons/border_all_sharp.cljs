(ns reagent-mui.icons.border-all-sharp
  "Imports @mui/icons-material/BorderAllSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def border-all-sharp (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm8 16H5v-6h6v6zm0-8H5V5h6v6zm8 8h-6v-6h6v6zm0-8h-6V5h6v6z"})
                                       "BorderAllSharp"))
