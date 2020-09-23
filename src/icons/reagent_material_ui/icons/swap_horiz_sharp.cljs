(ns reagent-material-ui.icons.swap-horiz-sharp
  "Imports @material-ui/icons/SwapHorizSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def swap-horiz-sharp (create-svg-icon (e "path" #js {"d" "M6.99 11L3 15l3.99 4v-3H14v-2H6.99v-3zM21 9l-3.99-4v3H10v2h7.01v3L21 9z"})
                                       "SwapHorizSharp"))
