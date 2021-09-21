(ns reagent-mui.icons.format-align-right-outlined
  "Imports @mui/icons-material/FormatAlignRightOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-align-right-outlined (create-svg-icon (e "path" #js {"d" "M3 21h18v-2H3v2zm6-4h12v-2H9v2zm-6-4h18v-2H3v2zm6-4h12V7H9v2zM3 3v2h18V3H3z"})
                                                  "FormatAlignRightOutlined"))
