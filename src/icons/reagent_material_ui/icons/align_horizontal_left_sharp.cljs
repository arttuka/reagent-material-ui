(ns reagent-material-ui.icons.align-horizontal-left-sharp
  "Imports @material-ui/icons/AlignHorizontalLeftSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def align-horizontal-left-sharp (create-svg-icon (e "path" #js {"d" "M4 22H2V2h2v20zM22 7H6v3h16V7zm-6 7H6v3h10v-3z"})
                                                  "AlignHorizontalLeftSharp"))
