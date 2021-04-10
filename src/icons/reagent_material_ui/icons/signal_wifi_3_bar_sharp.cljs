(ns reagent-material-ui.icons.signal-wifi-3-bar-sharp
  "Imports @material-ui/icons/SignalWifi3BarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-wifi-3-bar-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7L12 21.5 23.64 7z", "fillOpacity" ".3"}) (e "path" #js {"d" "M3.53 10.95L12 21.5l8.47-10.55C20.04 10.62 16.81 8 12 8s-8.04 2.62-8.47 2.95z"}))
                                              "SignalWifi3BarSharp"))
