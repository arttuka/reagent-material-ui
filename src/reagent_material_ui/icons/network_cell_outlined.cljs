(ns reagent-material-ui.icons.network-cell-outlined
  "Imports @material-ui/icons/NetworkCellOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def network-cell-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M2 22h20V2L2 22z", "fillOpacity" ".3"}) (e "path" #js {"d" "M17 7L2 22h15V7z"}))
                                            "NetworkCellOutlined"))
