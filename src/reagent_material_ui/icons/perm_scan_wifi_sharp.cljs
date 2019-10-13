(ns reagent-material-ui.icons.perm-scan-wifi-sharp
  "Imports @material-ui/icons/PermScanWifiSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def perm-scan-wifi-sharp (create-svg-icon (e "path" #js {"d" "M12 3C6.95 3 3.15 4.85 0 7.23L12 22 24 7.25C20.85 4.87 17.05 3 12 3zm1 13h-2v-6h2v6zm-2-8V6h2v2h-2z"})
                                           "PermScanWifiSharp"))
