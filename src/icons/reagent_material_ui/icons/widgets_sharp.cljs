(ns reagent-material-ui.icons.widgets-sharp
  "Imports @material-ui/icons/WidgetsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def widgets-sharp (create-svg-icon (e "path" #js {"d" "M13 13v8h8v-8h-8zM3 21h8v-8H3v8zM3 3v8h8V3H3zm13.66-1.31L11 7.34 16.66 13l5.66-5.66-5.66-5.65z"})
                                    "WidgetsSharp"))
