(ns reagent-material-ui.icons.battery-50-sharp
  "Imports @material-ui/icons/Battery50Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def battery-50-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 4h-3V2h-4v2H7v9h10V4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M7 13v9h10v-9H7z"}))
                                       "Battery50Sharp"))
