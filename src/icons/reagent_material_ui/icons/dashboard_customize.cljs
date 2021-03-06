(ns reagent-material-ui.icons.dashboard-customize
  "Imports @material-ui/icons/DashboardCustomize as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def dashboard-customize (create-svg-icon (e "path" #js {"d" "M3 3h8v8H3zm10 0h8v8h-8zM3 13h8v8H3zm15 0h-2v3h-3v2h3v3h2v-3h3v-2h-3z"})
                                          "DashboardCustomize"))
