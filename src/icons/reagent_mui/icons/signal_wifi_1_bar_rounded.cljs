(ns reagent-mui.icons.signal-wifi-1-bar-rounded
  "Imports @mui/icons-material/SignalWifi1BarRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-wifi-1-bar-rounded (create-svg-icon (e "React.Fragment" nil (e "path" #js {"d" "M6.67 14.86l3.77 4.7c.8 1 2.32 1 3.12 0l3.78-4.7C17.06 14.65 15.03 13 12 13s-5.06 1.65-5.33 1.86z"}) (e "path" #js {"fillOpacity" ".3", "d" "M23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7l10.08 12.56c.8 1 2.32 1 3.12 0L23.64 7z"}))
                                                "SignalWifi1BarRounded"))
