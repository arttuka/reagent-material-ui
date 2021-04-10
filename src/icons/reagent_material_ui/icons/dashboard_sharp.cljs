(ns reagent-material-ui.icons.dashboard-sharp
  "Imports @material-ui/icons/DashboardSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def dashboard-sharp (create-svg-icon (e "path" #js {"d" "M3 13h8V3H3v10zm0 8h8v-6H3v6zm10 0h8V11h-8v10zm0-18v6h8V3h-8z"})
                                      "DashboardSharp"))
