(ns reagent-mui.icons.perm-scan-wifi-two-tone
  "Imports @mui/icons-material/PermScanWifiTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def perm-scan-wifi-two-tone (create-svg-icon [(e "path" #js {"d" "M12 5c-3.26 0-6.2.85-9.08 2.65L12 18.83l9.08-11.16C18.18 5.85 15.25 5 12 5zm1 11h-2v-6h2v6zm-2-8V6h2v2h-2z", "opacity" ".3"}) (e "path" #js {"d" "M12 3C6.95 3 3.15 4.85 0 7.23L12 22 24 7.25C20.85 4.87 17.05 3 12 3zM2.92 7.65C5.8 5.85 8.74 5 12 5c3.25 0 6.18.85 9.08 2.67L12 18.83 2.92 7.65zM11 10h2v6h-2zm0-4h2v2h-2z"})]
                                              "PermScanWifiTwoTone"))
