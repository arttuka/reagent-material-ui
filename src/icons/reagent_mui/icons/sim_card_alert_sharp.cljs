(ns reagent-mui.icons.sim-card-alert-sharp
  "Imports @mui/icons-material/SimCardAlertSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sim-card-alert-sharp (create-svg-icon (e "path" #js {"d" "M20 2H10L4 8v14h16V2zm-7 15h-2v-2h2v2zm0-4h-2V8h2v5z"})
                                           "SimCardAlertSharp"))
