(ns reagent-material-ui.icons.horizontal-rule-sharp
  "Imports @material-ui/icons/HorizontalRuleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def horizontal-rule-sharp (create-svg-icon (e "path" #js {"d" "M4 11h16v2H4z", "fillRule" "evenodd"})
                                            "HorizontalRuleSharp"))
