(ns reagent-mui.icons.network-wifi-3-bar-rounded
  "Imports @mui/icons-material/NetworkWifi3BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def network-wifi-3-bar-rounded (create-svg-icon (e "path" #js {"d" "M12 4C7.7 4 3.78 5.6.79 8.24.35 8.63.32 9.3.73 9.71l10.56 10.58c.39.39 1.02.39 1.42 0L23.27 9.71c.41-.41.38-1.08-.06-1.47C20.22 5.6 16.3 4 12 4zM2.92 9.07C5.51 7.08 8.67 6 12 6s6.49 1.08 9.08 3.07l-2.85 2.86C16.46 10.71 14.31 10 12 10c-2.31 0-4.46.71-6.23 1.93L2.92 9.07z"})
                                                 "NetworkWifi3BarRounded"))
