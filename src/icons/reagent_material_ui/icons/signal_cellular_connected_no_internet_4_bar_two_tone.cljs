(ns reagent-material-ui.icons.signal-cellular-connected-no-internet-4-bar-two-tone
  "Imports @material-ui/icons/SignalCellularConnectedNoInternet4BarTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-connected-no-internet-4-bar-two-tone (create-svg-icon (e "path" #js {"d" "M20 18h2v-8h-2v8zm0 4h2v-2h-2v2zM2 22h16V8h4V2L2 22z"})
                                                                           "SignalCellularConnectedNoInternet4BarTwoTone"))
