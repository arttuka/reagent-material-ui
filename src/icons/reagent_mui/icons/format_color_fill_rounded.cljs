(ns reagent-mui.icons.format-color-fill-rounded
  "Imports @mui/icons-material/FormatColorFillRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-color-fill-rounded (create-svg-icon (e "path" #js {"d" "M8.94 16.56c.29.29.68.44 1.06.44s.77-.15 1.06-.44l5.5-5.5c.59-.58.59-1.53 0-2.12L8.32.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l1.68 1.68-5.15 5.15c-.59.59-.59 1.54 0 2.12l5.5 5.5zM10 5.21 14.79 10H5.21L10 5.21zM19 17c1.1 0 2-.9 2-2 0-1.33-2-3.5-2-3.5s-2 2.17-2 3.5c0 1.1.9 2 2 2zm1 3H4c-1.1 0-2 .9-2 2s.9 2 2 2h16c1.1 0 2-.9 2-2s-.9-2-2-2z"})
                                                "FormatColorFillRounded"))
