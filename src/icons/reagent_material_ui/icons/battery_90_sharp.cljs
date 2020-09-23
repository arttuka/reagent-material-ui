(ns reagent-material-ui.icons.battery-90-sharp
  "Imports @material-ui/icons/Battery90Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-90-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 4h-3V2h-4v2H7v4h10V4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M7 8v14h10V8H7z"}))
                                       "Battery90Sharp"))
