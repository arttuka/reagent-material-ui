(ns reagent-material-ui.icons.align-vertical-center-sharp
  "Imports @material-ui/icons/AlignVerticalCenterSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def align-vertical-center-sharp (create-svg-icon (e "path" #js {"d" "M22 11h-5V6h-3v5h-4V3H7v8H1.84v2H7v8h3v-8h4v5h3v-5h5z"})
                                                  "AlignVerticalCenterSharp"))
