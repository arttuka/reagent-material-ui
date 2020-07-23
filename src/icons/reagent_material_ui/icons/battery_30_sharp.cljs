(ns reagent-material-ui.icons.battery-30-sharp
  "Imports @material-ui/icons/Battery30Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-30-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 4h-3V2h-4v2H7v11h10V4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M7 15v7h10v-7H7z"}))
                                       "Battery30Sharp"))
