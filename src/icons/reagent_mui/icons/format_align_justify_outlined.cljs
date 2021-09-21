(ns reagent-mui.icons.format-align-justify-outlined
  "Imports @mui/icons-material/FormatAlignJustifyOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-align-justify-outlined (create-svg-icon (e "path" #js {"d" "M3 21h18v-2H3v2zm0-4h18v-2H3v2zm0-4h18v-2H3v2zm0-4h18V7H3v2zm0-6v2h18V3H3z"})
                                                    "FormatAlignJustifyOutlined"))
