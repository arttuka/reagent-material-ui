(ns reagent-material-ui.icons.signal-cellular-1-bar-sharp
  "Imports @material-ui/icons/SignalCellular1BarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-1-bar-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M2 22h20V2L2 22z", "fillOpacity" ".3"}) (e "path" #js {"d" "M12 12L2 22h10V12z"}))
                                                  "SignalCellular1BarSharp"))
