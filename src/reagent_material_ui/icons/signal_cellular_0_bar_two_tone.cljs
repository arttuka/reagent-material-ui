(ns reagent-material-ui.icons.signal-cellular-0-bar-two-tone
  "Imports @material-ui/icons/SignalCellular0BarTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-0-bar-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M2 22h20V2L2 22z", "fillOpacity" ".3"}))
                                                     "SignalCellular0BarTwoTone"))
