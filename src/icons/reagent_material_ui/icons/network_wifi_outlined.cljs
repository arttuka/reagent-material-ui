(ns reagent-material-ui.icons.network-wifi-outlined
  "Imports @material-ui/icons/NetworkWifiOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def network-wifi-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7L12 21.5 23.64 7z", "fillOpacity" ".3"}) (e "path" #js {"d" "M3.53 10.94L12 21.5l8.47-10.56c-.43-.33-3.66-2.95-8.47-2.95s-8.04 2.62-8.47 2.95z"}))
                                            "NetworkWifiOutlined"))
