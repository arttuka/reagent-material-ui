(ns reagent-mui.icons.network-wifi-3-bar-two-tone
  "Imports @mui/icons-material/NetworkWifi3BarTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def network-wifi-3-bar-two-tone (create-svg-icon [(e "path" #js {"d" "M2.92 9.07C5.51 7.08 8.67 6 12 6s6.49 1.08 9.08 3.07l-2.85 2.86C16.46 10.71 14.31 10 12 10c-2.31 0-4.46.71-6.23 1.93L2.92 9.07z", "opacity" ".3"}) (e "path" #js {"d" "M12 4C7.31 4 3.07 5.9 0 8.98L12 21 24 8.98C20.93 5.9 16.69 4 12 4zM2.92 9.07C5.51 7.08 8.67 6 12 6s6.49 1.08 9.08 3.07l-2.85 2.86C16.46 10.71 14.31 10 12 10c-2.31 0-4.46.71-6.23 1.93L2.92 9.07z"})]
                                                  "NetworkWifi3BarTwoTone"))
