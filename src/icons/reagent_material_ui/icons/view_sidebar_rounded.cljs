(ns reagent-material-ui.icons.view-sidebar-rounded
  "Imports @material-ui/icons/ViewSidebarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-sidebar-rounded (create-svg-icon (e "path" #js {"d" "M15 20H3c-.55 0-1-.45-1-1V5c0-.55.45-1 1-1h12c.55 0 1 .45 1 1v14c0 .55-.45 1-1 1zm4-12h2c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v2c0 .55.45 1 1 1zm0 12h2c.55 0 1-.45 1-1v-2c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v2c0 .55.45 1 1 1zm0-6h2c.55 0 1-.45 1-1v-2c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v2c0 .55.45 1 1 1z"})
                                           "ViewSidebarRounded"))
