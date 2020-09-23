(ns reagent-material-ui.icons.signal-wifi-1-bar-sharp
  "Imports @material-ui/icons/SignalWifi1BarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-wifi-1-bar-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12.01 21.49L23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7l11.63 14.49.01.01.01-.01z", "fillOpacity" ".3"}) (e "path" #js {"d" "M6.67 14.86L12 21.49v.01l.01-.01 5.33-6.63C17.06 14.65 15.03 13 12 13s-5.06 1.65-5.33 1.86z"}))
                                              "SignalWifi1BarSharp"))
