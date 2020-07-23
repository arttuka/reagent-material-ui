(ns reagent-material-ui.icons.insert-chart-sharp
  "Imports @material-ui/icons/InsertChartSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def insert-chart-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM9 17H7v-7h2v7zm4 0h-2V7h2v10zm4 0h-2v-4h2v4z"})
                                         "InsertChartSharp"))
