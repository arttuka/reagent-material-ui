(ns reagent-mui.icons.align-horizontal-right
  "Imports @mui/icons-material/AlignHorizontalRight as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def align-horizontal-right (create-svg-icon (e "path" #js {"d" "M20 2h2v20h-2V2zM2 10h16V7H2v3zm6 7h10v-3H8v3z"})
                                             "AlignHorizontalRight"))
