(ns reagent-mui.icons.horizontal-rule-two-tone
  "Imports @mui/icons-material/HorizontalRuleTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def horizontal-rule-two-tone (create-svg-icon (e "path" #js {"fillRule" "evenodd", "d" "M4 11h16v2H4z"})
                                               "HorizontalRuleTwoTone"))
