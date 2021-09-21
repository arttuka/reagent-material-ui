(ns reagent-mui.icons.format-align-right-two-tone
  "Imports @mui/icons-material/FormatAlignRightTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-align-right-two-tone (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3zm0 16h18v2H3zm0-8h18v2H3zm6 4h12v2H9zm0-8h12v2H9z"})
                                                  "FormatAlignRightTwoTone"))
