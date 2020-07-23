(ns reagent-material-ui.icons.vertical-split
  "Imports @material-ui/icons/VerticalSplit as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def vertical-split (create-svg-icon (e "path" #js {"d" "M3 15h8v-2H3v2zm0 4h8v-2H3v2zm0-8h8V9H3v2zm0-6v2h8V5H3zm10 0h8v14h-8V5z"})
                                     "VerticalSplit"))
