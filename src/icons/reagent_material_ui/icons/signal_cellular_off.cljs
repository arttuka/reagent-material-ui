(ns reagent-material-ui.icons.signal-cellular-off
  "Imports @material-ui/icons/SignalCellularOff as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-off (create-svg-icon (e "path" #js {"d" "M21 1l-8.59 8.59L21 18.18V1zM4.77 4.5L3.5 5.77l6.36 6.36L1 21h17.73l2 2L22 21.73 4.77 4.5z"})
                                          "SignalCellularOff"))
