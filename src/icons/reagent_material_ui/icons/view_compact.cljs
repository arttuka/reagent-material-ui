(ns reagent-material-ui.icons.view-compact
  "Imports @material-ui/icons/ViewCompact as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-compact (create-svg-icon (e "path" #js {"d" "M3 19h6v-7H3v7zm7 0h12v-7H10v7zM3 5v6h19V5H3z"})
                                   "ViewCompact"))
