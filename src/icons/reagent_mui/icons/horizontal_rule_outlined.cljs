(ns reagent-mui.icons.horizontal-rule-outlined
  "Imports @mui/icons-material/HorizontalRuleOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def horizontal-rule-outlined (create-svg-icon (e "path" #js {"fillRule" "evenodd", "d" "M4 11h16v2H4z"})
                                               "HorizontalRuleOutlined"))
