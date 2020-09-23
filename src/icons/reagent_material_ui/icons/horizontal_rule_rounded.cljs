(ns reagent-material-ui.icons.horizontal-rule-rounded
  "Imports @material-ui/icons/HorizontalRuleRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def horizontal-rule-rounded (create-svg-icon (e "path" #js {"d" "M19 13H5c-.55 0-1-.45-1-1s.45-1 1-1h14c.55 0 1 .45 1 1s-.45 1-1 1z", "fillRule" "evenodd"})
                                              "HorizontalRuleRounded"))
