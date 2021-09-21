(ns reagent-mui.icons.signal-cellular-connected-no-internet-2-bar
  "Imports @mui/icons-material/SignalCellularConnectedNoInternet2Bar as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-cellular-connected-no-internet-2-bar (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M22 8V2L2 22h16V8z"}) (e "path" #js {"d" "M14 22V10L2 22h12zm6-12v8h2v-8h-2zm0 12h2v-2h-2v2z"}))
                                                                  "SignalCellularConnectedNoInternet2Bar"))
