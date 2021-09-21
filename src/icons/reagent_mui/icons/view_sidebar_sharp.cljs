(ns reagent-mui.icons.view-sidebar-sharp
  "Imports @mui/icons-material/ViewSidebarSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-sidebar-sharp (create-svg-icon (e "path" #js {"d" "M16 20H2V4h14v16zm2-12h4V4h-4v4zm0 12h4v-4h-4v4zm0-6h4v-4h-4v4z"})
                                         "ViewSidebarSharp"))
