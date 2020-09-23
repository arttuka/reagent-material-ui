(ns reagent-material-ui.icons.reorder-sharp
  "Imports @material-ui/icons/ReorderSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def reorder-sharp (create-svg-icon (e "path" #js {"d" "M3 15h18v-2H3v2zm0 4h18v-2H3v2zm0-8h18V9H3v2zm0-6v2h18V5H3z"})
                                    "ReorderSharp"))
