(ns reagent-mui.icons.format-indent-increase-two-tone
  "Imports @mui/icons-material/FormatIndentIncreaseTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-indent-increase-two-tone (create-svg-icon (e "path" #js {"d" "M3 19h18v2H3zM3 3h18v2H3zm8 4h10v2H11zM3 8v8l4-4zm8 3h10v2H11zm0 4h10v2H11z"})
                                                      "FormatIndentIncreaseTwoTone"))
