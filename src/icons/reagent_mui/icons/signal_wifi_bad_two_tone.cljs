(ns reagent-mui.icons.signal-wifi-bad-two-tone
  "Imports @mui/icons-material/SignalWifiBadTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-wifi-bad-two-tone (create-svg-icon (e "path" #js {"d" "M24 8.98C20.93 5.9 16.69 4 12 4S3.07 5.9 0 8.98L12 21v-9h8.99L24 8.98zM19.59 14l-2.09 2.09-.3-.3L15.41 14 14 15.41l1.79 1.79.3.3L14 19.59 15.41 21l2.09-2.08L19.59 21 21 19.59l-2.08-2.09L21 15.41 19.59 14z"})
                                               "SignalWifiBadTwoTone"))
