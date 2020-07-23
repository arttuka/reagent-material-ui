(ns reagent-material-ui.icons.signal-cellular-connected-no-internet-2-bar-sharp
  "Imports @material-ui/icons/SignalCellularConnectedNoInternet2BarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-connected-no-internet-2-bar-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M22 8V2L2 22h16V8h4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M14 22V10L2 22h12zm6-12v8h2v-8h-2zm0 12h2v-2h-2v2z"}))
                                                                        "SignalCellularConnectedNoInternet2BarSharp"))
