(ns reagent-mui.icons.indeterminate-check-box-sharp
  "Imports @mui/icons-material/IndeterminateCheckBoxSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def indeterminate-check-box-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-4 10H7v-2h10v2z"})
                                                    "IndeterminateCheckBoxSharp"))
