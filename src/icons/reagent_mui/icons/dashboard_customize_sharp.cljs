(ns reagent-mui.icons.dashboard-customize-sharp
  "Imports @mui/icons-material/DashboardCustomizeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dashboard-customize-sharp (create-svg-icon (e "path" #js {"d" "M3 3h8v8H3V3zm10 0h8v8h-8V3zM3 13h8v8H3v-8zm15 0h-2v3h-3v2h3v3h2v-3h3v-2h-3v-3z"})
                                                "DashboardCustomizeSharp"))
