(ns reagent-material-ui.icons.horizontal-rule-two-tone
  "Imports @material-ui/icons/HorizontalRuleTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def horizontal-rule-two-tone (create-svg-icon (e "path" #js {"fillRule" "evenodd", "d" "M4 11h16v2H4z"})
                                               "HorizontalRuleTwoTone"))
