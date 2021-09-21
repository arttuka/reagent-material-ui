(ns reagent-mui.icons.signal-wifi-statusbar-null-outlined
  "Imports @mui/icons-material/SignalWifiStatusbarNullOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def signal-wifi-statusbar-null-outlined (create-svg-icon (e "path" #js {"d" "M12 4C7.31 4 3.07 5.9 0 8.98L12 21 24 8.98C20.93 5.9 16.69 4 12 4zM2.92 9.07C5.51 7.08 8.67 6 12 6s6.49 1.08 9.08 3.07L12 18.17l-9.08-9.1z"})
                                                          "SignalWifiStatusbarNullOutlined"))
