(ns reagent-material-ui.icons.signal-wifi-statusbar-connected-no-internet-4
  "Imports @material-ui/icons/SignalWifiStatusbarConnectedNoInternet4 as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-wifi-statusbar-connected-no-internet-4 (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 4C7.31 4 3.07 5.9 0 8.98L12 21l5-5.01V8h5.92C19.97 5.51 16.16 4 12 4zm7 14h2v2h-2z"}) (e "path" #js {"d" "M19 10h2v6h-2z"}))
                                                                    "SignalWifiStatusbarConnectedNoInternet4"))
