(ns reagent-mui.icons.network-wifi
  "Imports @mui/icons-material/NetworkWifi as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def network-wifi (create-svg-icon (e "path" #js {"d" "M24 8.98C20.93 5.9 16.69 4 12 4S3.07 5.9 0 8.98L12 21 24 8.98zm-21.08.09C5.51 7.08 8.67 6 12 6s6.49 1.08 9.08 3.07l-1.43 1.43C17.5 8.94 14.86 8 12 8s-5.5.94-7.65 2.51L2.92 9.07z"})
                                   "NetworkWifi"))
