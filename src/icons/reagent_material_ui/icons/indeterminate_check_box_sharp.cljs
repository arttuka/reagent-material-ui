(ns reagent-material-ui.icons.indeterminate-check-box-sharp
  "Imports @material-ui/icons/IndeterminateCheckBoxSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def indeterminate-check-box-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-4 10H7v-2h10v2z"})
                                                    "IndeterminateCheckBoxSharp"))
