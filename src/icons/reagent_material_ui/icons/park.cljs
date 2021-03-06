(ns reagent-material-ui.icons.park
  "Imports @material-ui/icons/Park as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def park (create-svg-icon (e "path" #js {"d" "M17 12h2L12 2 5.05 12H7l-3.9 6h6.92v4h3.96v-4H21z"})
                           "Park"))
