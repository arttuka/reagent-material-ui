(ns reagent-material-ui.icons.signal-wifi-statusbar-4-bar-outlined
  "Imports @material-ui/icons/SignalWifiStatusbar4BarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-wifi-statusbar-4-bar-outlined (create-svg-icon (e "path" #js {"d" "M12 4C7.31 4 3.07 5.9 0 8.98L12 21 24 8.98C20.93 5.9 16.69 4 12 4z"})
                                                           "SignalWifiStatusbar4BarOutlined"))
