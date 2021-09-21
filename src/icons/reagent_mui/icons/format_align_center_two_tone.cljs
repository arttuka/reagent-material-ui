(ns reagent-mui.icons.format-align-center-two-tone
  "Imports @mui/icons-material/FormatAlignCenterTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-align-center-two-tone (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3zm4 12h10v2H7zm0-8h10v2H7zm-4 4h18v2H3zm0 8h18v2H3z"})
                                                   "FormatAlignCenterTwoTone"))
