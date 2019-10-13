(ns reagent-material-ui.icons.network-cell-rounded
  "Imports @material-ui/icons/NetworkCellRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def network-cell-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M4.41 22H20c1.1 0 2-.9 2-2V4.41c0-.89-1.08-1.34-1.71-.71L3.71 20.29c-.63.63-.19 1.71.7 1.71z", "fillOpacity" ".3"}) (e "path" #js {"d" "M17 7L3.71 20.29c-.63.63-.19 1.71.7 1.71H17V7z"}))
                                           "NetworkCellRounded"))
