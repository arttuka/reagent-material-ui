(ns reagent-mui.icons.tv-sharp
  "Imports @mui/icons-material/TvSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tv-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v16h7v2h8v-2h6.99L23 3zm-2 14H3V5h18v12z"})
                               "TvSharp"))
