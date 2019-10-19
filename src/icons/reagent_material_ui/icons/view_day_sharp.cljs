(ns reagent-material-ui.icons.view-day-sharp
  "Imports @material-ui/icons/ViewDaySharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-day-sharp (create-svg-icon (e "path" #js {"d" "M2 21h19v-3H2v3zM21 8H2v8h19V8zM2 3v3h19V3H2z"})
                                     "ViewDaySharp"))
