(ns reagent-material-ui.icons.bolt-sharp
  "Imports @material-ui/icons/BoltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def bolt-sharp (create-svg-icon (e "path" #js {"d" "M11 21h-1l1-7H6.74S10.42 7.54 13 3h1l-1 7h4.28L11 21z"})
                                 "BoltSharp"))
