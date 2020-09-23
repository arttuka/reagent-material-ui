(ns reagent-material-ui.icons.network-wifi-rounded
  "Imports @material-ui/icons/NetworkWifiRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def network-wifi-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7l10.08 12.56c.8 1 2.32 1 3.12 0L23.64 7z", "fillOpacity" ".3"}) (e "path" #js {"d" "M3.53 10.94l6.91 8.61c.8 1 2.32 1 3.12 0l6.91-8.61c-.43-.33-3.66-2.95-8.47-2.95s-8.04 2.62-8.47 2.95z"}))
                                           "NetworkWifiRounded"))
