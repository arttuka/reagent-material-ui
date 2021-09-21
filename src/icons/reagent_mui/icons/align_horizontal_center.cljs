(ns reagent-mui.icons.align-horizontal-center
  "Imports @mui/icons-material/AlignHorizontalCenter as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def align-horizontal-center (create-svg-icon (e "path" #js {"d" "M11 2h2v5h8v3h-8v4h5v3h-5v5h-2v-5H6v-3h5v-4H3V7h8z"})
                                              "AlignHorizontalCenter"))
