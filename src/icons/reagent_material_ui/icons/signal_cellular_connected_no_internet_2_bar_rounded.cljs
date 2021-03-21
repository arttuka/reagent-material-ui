(ns reagent-material-ui.icons.signal-cellular-connected-no-internet-2-bar-rounded
  "Imports @material-ui/icons/SignalCellularConnectedNoInternet2BarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-connected-no-internet-2-bar-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M22 8V4.41c0-.89-1.08-1.34-1.71-.71L3.71 20.29c-.63.63-.19 1.71.7 1.71H18V11c0-1.66 1.34-3 3-3h1z", "fillOpacity" ".3"}) (e "path" #js {"d" "M14 22V10L3.71 20.29c-.63.63-.19 1.71.7 1.71H14zm6-11v6c0 .55.45 1 1 1s1-.45 1-1v-6c0-.55-.45-1-1-1s-1 .45-1 1zm0 11h2v-2h-2v2z"}))
                                                                          "SignalCellularConnectedNoInternet2BarRounded"))
