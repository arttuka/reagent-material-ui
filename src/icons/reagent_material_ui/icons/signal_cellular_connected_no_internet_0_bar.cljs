(ns reagent-material-ui.icons.signal-cellular-connected-no-internet-0-bar
  "Imports @material-ui/icons/SignalCellularConnectedNoInternet0Bar as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-connected-no-internet-0-bar (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M22 8V2L2 22h16V8z", "fillOpacity" ".3"}) (e "path" #js {"d" "M20 22h2v-2h-2v2zm0-12v8h2v-8h-2z"}))
                                                                  "SignalCellularConnectedNoInternet0Bar"))
