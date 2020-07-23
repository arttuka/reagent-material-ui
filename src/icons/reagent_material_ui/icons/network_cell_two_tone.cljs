(ns reagent-material-ui.icons.network-cell-two-tone
  "Imports @material-ui/icons/NetworkCellTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def network-cell-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M2 22h20V2L2 22z", "fillOpacity" ".3"}) (e "path" #js {"d" "M17 7L2 22h15V7z"}))
                                            "NetworkCellTwoTone"))
