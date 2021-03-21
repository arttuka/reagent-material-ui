(ns reagent-material-ui.icons.view-sidebar-sharp
  "Imports @material-ui/icons/ViewSidebarSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-sidebar-sharp (create-svg-icon (e "path" #js {"d" "M16 20H2V4h14v16zm2-12h4V4h-4v4zm0 12h4v-4h-4v4zm0-6h4v-4h-4v4z"})
                                         "ViewSidebarSharp"))
