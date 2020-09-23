(ns reagent-material-ui.icons.message-sharp
  "Imports @material-ui/icons/MessageSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def message-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2.01L2 22l4-4h16V2zm-4 12H6v-2h12v2zm0-3H6V9h12v2zm0-3H6V6h12v2z"})
                                    "MessageSharp"))
