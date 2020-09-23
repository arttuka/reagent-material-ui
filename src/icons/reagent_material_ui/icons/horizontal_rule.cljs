(ns reagent-material-ui.icons.horizontal-rule
  "Imports @material-ui/icons/HorizontalRule as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def horizontal-rule (create-svg-icon (e "path" #js {"d" "M4 11h16v2H4z", "fillRule" "evenodd"})
                                      "HorizontalRule"))
