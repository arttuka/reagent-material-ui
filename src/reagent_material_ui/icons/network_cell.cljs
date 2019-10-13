(ns reagent-material-ui.icons.network-cell
  "Imports @material-ui/icons/NetworkCell as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def network-cell (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M2 22h20V2z", "fillOpacity" ".3"}) (e "path" #js {"d" "M17 7L2 22h15z"}))
                                   "NetworkCell"))
