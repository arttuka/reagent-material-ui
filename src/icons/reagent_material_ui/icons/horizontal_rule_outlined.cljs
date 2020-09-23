(ns reagent-material-ui.icons.horizontal-rule-outlined
  "Imports @material-ui/icons/HorizontalRuleOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def horizontal-rule-outlined (create-svg-icon (e "path" #js {"d" "M4 11h16v2H4z", "fillRule" "evenodd"})
                                               "HorizontalRuleOutlined"))
