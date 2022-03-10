(ns reagent-mui.icons.network-wifi-1-bar-rounded
  "Imports @mui/icons-material/NetworkWifi1BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def network-wifi-1-bar-rounded (create-svg-icon (e "path" #js {"d" "M12 4C7.31 4 3.07 5.9 0 8.98L12 21 24 8.98C20.93 5.9 16.69 4 12 4zm3.32 10.84C14.34 14.3 13.2 14 12 14c-1.2 0-2.34.3-3.32.84L2.92 9.07C5.51 7.08 8.67 6 12 6s6.49 1.08 9.08 3.07l-5.76 5.77z"})
                                                 "NetworkWifi1BarRounded"))
