(ns reagent-material-ui.icons.signal-cellular-connected-no-internet-4-bar
  "Imports @material-ui/icons/SignalCellularConnectedNoInternet4Bar as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-connected-no-internet-4-bar (create-svg-icon (e "path" #js {"d" "M20 18h2v-8h-2v8zm0 4h2v-2h-2v2zM2 22h16V8h4V2L2 22z"})
                                                                  "SignalCellularConnectedNoInternet4Bar"))
