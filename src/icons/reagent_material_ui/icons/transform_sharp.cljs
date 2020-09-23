(ns reagent-material-ui.icons.transform-sharp
  "Imports @material-ui/icons/TransformSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def transform-sharp (create-svg-icon (e "path" #js {"d" "M22 18v-2H8V4h2L7 1 4 4h2v2H2v2h4v10h10v2h-2l3 3 3-3h-2v-2h4zM10 8h6v6h2V6h-8v2z"})
                                      "TransformSharp"))
