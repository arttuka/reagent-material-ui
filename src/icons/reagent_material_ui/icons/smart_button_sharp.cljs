(ns reagent-material-ui.icons.smart-button-sharp
  "Imports @material-ui/icons/SmartButtonSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def smart-button-sharp (create-svg-icon (e "path" #js {"d" "M22 17h-3v-2h1V9H4v6h6v2H2V7h20v10zm-7.5 2l1.09-2.41L18 15.5l-2.41-1.09L14.5 12l-1.09 2.41L11 15.5l2.41 1.09L14.5 19zm2.5-5l.62-1.38L19 12l-1.38-.62L17 10l-.62 1.38L15 12l1.38.62L17 14z"})
                                         "SmartButtonSharp"))
