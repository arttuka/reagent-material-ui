(ns reagent-mui.icons.format-align-left-sharp
  "Imports @mui/icons-material/FormatAlignLeftSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-align-left-sharp (create-svg-icon (e "path" #js {"d" "M15 15H3v2h12v-2zm0-8H3v2h12V7zM3 13h18v-2H3v2zm0 8h18v-2H3v2zM3 3v2h18V3H3z"})
                                              "FormatAlignLeftSharp"))
