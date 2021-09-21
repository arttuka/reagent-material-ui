(ns reagent-mui.icons.signal-wifi-2-bar-two-tone
  "Imports @mui/icons-material/SignalWifi2BarTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-wifi-2-bar-two-tone (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7L12 21.5 23.64 7z"}) (e "path" #js {"d" "M4.79 12.52L12 21.5l7.21-8.99C18.85 12.24 16.1 10 12 10s-6.85 2.24-7.21 2.52z"}))
                                                 "SignalWifi2BarTwoTone"))
