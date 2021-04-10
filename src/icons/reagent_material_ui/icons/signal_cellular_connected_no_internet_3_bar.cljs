(ns reagent-material-ui.icons.signal-cellular-connected-no-internet-3-bar
  "Imports @material-ui/icons/SignalCellularConnectedNoInternet3Bar as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-connected-no-internet-3-bar (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M22 8V2L2 22h16V8z", "fillOpacity" ".3"}) (e "path" #js {"d" "M17 22V7L2 22h15zm3-12v8h2v-8h-2zm0 12h2v-2h-2v2z"}))
                                                                  "SignalCellularConnectedNoInternet3Bar"))
