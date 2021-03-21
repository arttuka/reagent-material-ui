(ns reagent-material-ui.icons.horizontal-rule-sharp
  "Imports @material-ui/icons/HorizontalRuleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def horizontal-rule-sharp (create-svg-icon (e "path" #js {"d" "M4 11h16v2H4z", "fillRule" "evenodd"})
                                            "HorizontalRuleSharp"))
