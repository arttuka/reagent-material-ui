(ns reagent-mui.icons.format-align-justify-two-tone
  "Imports @mui/icons-material/FormatAlignJustifyTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-align-justify-two-tone (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3zm0 8h18v2H3zm0 8h18v2H3zm0-4h18v2H3zm0-8h18v2H3z"})
                                                    "FormatAlignJustifyTwoTone"))
