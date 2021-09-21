(ns reagent-mui.icons.align-vertical-center
  "Imports @mui/icons-material/AlignVerticalCenter as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def align-vertical-center (create-svg-icon (e "path" #js {"d" "M22 11h-5V6h-3v5h-4V3H7v8H1.84v2H7v8h3v-8h4v5h3v-5h5z"})
                                            "AlignVerticalCenter"))
