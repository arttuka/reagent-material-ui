(ns reagent-mui.icons.horizontal-split
  "Imports @mui/icons-material/HorizontalSplit as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def horizontal-split (create-svg-icon (e "path" #js {"d" "M3 19h18v-6H3v6zm0-8h18V9H3v2zm0-6v2h18V5H3z"})
                                       "HorizontalSplit"))
