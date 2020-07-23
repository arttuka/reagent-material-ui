(ns reagent-material-ui.icons.exposure-neg-1
  "Imports @material-ui/icons/ExposureNeg1 as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def exposure-neg-1 (create-svg-icon (e "path" #js {"d" "M4 11v2h8v-2H4zm15 7h-2V7.38L14 8.4V6.7L18.7 5h.3v13z"})
                                     "ExposureNeg1"))
