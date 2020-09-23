(ns reagent-material-ui.icons.signal-wifi-3-bar-rounded
  "Imports @material-ui/icons/SignalWifi3BarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-wifi-3-bar-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7l10.08 12.56c.8 1 2.32 1 3.12 0L23.64 7z", "fillOpacity" ".3"}) (e "path" #js {"d" "M3.53 10.95l6.91 8.61c.8 1 2.32 1 3.12 0l6.91-8.61C20.04 10.62 16.81 8 12 8s-8.04 2.62-8.47 2.95z"}))
                                                "SignalWifi3BarRounded"))
