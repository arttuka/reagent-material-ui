(ns reagent-material-ui.icons.horizontal-rule-rounded
  "Imports @material-ui/icons/HorizontalRuleRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def horizontal-rule-rounded (create-svg-icon (e "path" #js {"fillRule" "evenodd", "d" "M19 13H5c-.55 0-1-.45-1-1s.45-1 1-1h14c.55 0 1 .45 1 1s-.45 1-1 1z"})
                                              "HorizontalRuleRounded"))
