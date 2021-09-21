(ns reagent-mui.icons.format-italic-two-tone
  "Imports @mui/icons-material/FormatItalicTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-italic-two-tone (create-svg-icon (e "path" #js {"d" "M6 15v3h8v-3h-2.21l3.42-8H18V4h-8v3h2.21l-3.42 8z"})
                                             "FormatItalicTwoTone"))
