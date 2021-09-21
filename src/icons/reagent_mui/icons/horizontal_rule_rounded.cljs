(ns reagent-mui.icons.horizontal-rule-rounded
  "Imports @mui/icons-material/HorizontalRuleRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def horizontal-rule-rounded (create-svg-icon (e "path" #js {"fillRule" "evenodd", "d" "M19 13H5c-.55 0-1-.45-1-1s.45-1 1-1h14c.55 0 1 .45 1 1s-.45 1-1 1z"})
                                              "HorizontalRuleRounded"))
