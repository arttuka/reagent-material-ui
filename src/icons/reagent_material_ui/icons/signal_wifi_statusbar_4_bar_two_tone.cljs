(ns reagent-material-ui.icons.signal-wifi-statusbar-4-bar-two-tone
  "Imports @material-ui/icons/SignalWifiStatusbar4BarTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-wifi-statusbar-4-bar-two-tone (create-svg-icon (e "path" #js {"d" "M12 4C7.31 4 3.07 5.9 0 8.98L12 21 24 8.98C20.93 5.9 16.69 4 12 4z"})
                                                           "SignalWifiStatusbar4BarTwoTone"))
