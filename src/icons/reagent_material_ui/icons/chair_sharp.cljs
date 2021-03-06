(ns reagent-material-ui.icons.chair-sharp
  "Imports @material-ui/icons/ChairSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def chair-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 13h10V7h3V3H4v4h3z"}) (e "path" #js {"d" "M23 9h-4v6H5V9H1v10h3v1c0 .55.45 1 1 1s1-.45 1-1v-1h12v1c0 .55.45 1 1 1s1-.45 1-1v-1h3V9z"}))
                                  "ChairSharp"))
