(ns reagent-material-ui.icons.horizontal-split-sharp
  "Imports @material-ui/icons/HorizontalSplitSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def horizontal-split-sharp (create-svg-icon (e "path" #js {"d" "M3 19h18v-6H3v6zm0-8h18V9H3v2zm0-6v2h18V5H3z"})
                                             "HorizontalSplitSharp"))
