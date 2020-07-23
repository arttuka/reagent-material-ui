(ns reagent-material-ui.icons.expand-more-sharp
  "Imports @material-ui/icons/ExpandMoreSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def expand-more-sharp (create-svg-icon (e "path" #js {"d" "M16.59 8.59L12 13.17 7.41 8.59 6 10l6 6 6-6-1.41-1.41z"})
                                        "ExpandMoreSharp"))
