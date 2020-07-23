(ns reagent-material-ui.icons.free-breakfast-sharp
  "Imports @material-ui/icons/FreeBreakfastSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def free-breakfast-sharp (create-svg-icon (e "path" #js {"d" "M20 3H4v14h14v-7h2c1.11 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 5h-2V5h2v3zM4 19h16v2H4v-2z"})
                                           "FreeBreakfastSharp"))
