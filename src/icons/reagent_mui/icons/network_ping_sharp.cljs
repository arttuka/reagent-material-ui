(ns reagent-mui.icons.network-ping-sharp
  "Imports @mui/icons-material/NetworkPingSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def network-ping-sharp (create-svg-icon (e "path" #js {"d" "M12 14.67 3.41 6.09 2 7.5l8.5 8.5H4v2h16v-2h-6.5l5.15-5.15c.26.1.55.15.85.15 1.38 0 2.5-1.12 2.5-2.5S20.88 6 19.5 6 17 7.12 17 8.5c0 .35.07.67.2.97l-5.2 5.2z"})
                                         "NetworkPingSharp"))
