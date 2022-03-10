(ns reagent-mui.icons.network-ping-rounded
  "Imports @mui/icons-material/NetworkPingRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def network-ping-rounded (create-svg-icon (e "path" #js {"d" "M2.71 6.79c-.39.39-.39 1.02 0 1.41L10.5 16H5c-.55 0-1 .45-1 1s.45 1 1 1h14c.55 0 1-.45 1-1s-.45-1-1-1h-5.5l5.15-5.15c.26.1.55.15.85.15 1.38 0 2.5-1.12 2.5-2.5S20.88 6 19.5 6 17 7.12 17 8.5c0 .35.07.67.2.97l-5.2 5.2-7.88-7.88a.9959.9959 0 0 0-1.41 0z"})
                                           "NetworkPingRounded"))
