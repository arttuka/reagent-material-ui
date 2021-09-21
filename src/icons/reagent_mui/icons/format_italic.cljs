(ns reagent-mui.icons.format-italic
  "Imports @mui/icons-material/FormatItalic as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-italic (create-svg-icon (e "path" #js {"d" "M10 4v3h2.21l-3.42 8H6v3h8v-3h-2.21l3.42-8H18V4z"})
                                    "FormatItalic"))
