(ns reagent-mui.icons.margin-sharp
  "Imports @mui/icons-material/MarginSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def margin-sharp (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm6 10H7v-2h2v2zm0-4H7V7h2v2zm4 4h-2v-2h2v2zm0-4h-2V7h2v2zm4 4h-2v-2h2v2zm0-4h-2V7h2v2z"})
                                   "MarginSharp"))
