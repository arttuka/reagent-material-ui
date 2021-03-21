(ns reagent-material-ui.icons.signal-cellular-connected-no-internet-3-bar-outlined
  "Imports @material-ui/icons/SignalCellularConnectedNoInternet3BarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-connected-no-internet-3-bar-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M22 8V2L2 22h16V8h4z", "fillOpacity" ".3"}) (e "path" #js {"d" "M18 22V6L2 22h16zm2-12v8h2v-8h-2zm0 12h2v-2h-2v2z"}))
                                                                           "SignalCellularConnectedNoInternet3BarOutlined"))
