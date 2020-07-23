(ns reagent-material-ui.icons.power-sharp
  "Imports @material-ui/icons/PowerSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def power-sharp (create-svg-icon (e "path" #js {"d" "M16 7V3h-2v4h-4V3H8v4H6v7.5L9.5 18v3h5v-3l3.5-3.51V7h-2z"})
                                  "PowerSharp"))
