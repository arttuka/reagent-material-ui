(ns reagent-mui.icons.format-indent-decrease-two-tone
  "Imports @mui/icons-material/FormatIndentDecreaseTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-indent-decrease-two-tone (create-svg-icon (e "path" #js {"d" "M7 16V8l-4 4zm4-9h10v2H11zm0 4h10v2H11zm0 4h10v2H11zm-8 4h18v2H3zM3 3h18v2H3z"})
                                                      "FormatIndentDecreaseTwoTone"))
