(ns reagent-mui.icons.add-alert-sharp
  "Imports @mui/icons-material/AddAlertSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-alert-sharp (create-svg-icon (e "path" #js {"d" "M12 23c1.1 0 1.99-.89 1.99-1.99h-3.98c0 1.1.89 1.99 1.99 1.99zm7-6v-6c0-3.35-2.36-6.15-5.5-6.83V1.5h-3v2.67C7.36 4.85 5 7.65 5 11v6l-2 2v1h18v-1l-2-2zm-3-3.99h-3v3h-2v-3H8V11h3V8h2v3h3v2.01z"})
                                      "AddAlertSharp"))
