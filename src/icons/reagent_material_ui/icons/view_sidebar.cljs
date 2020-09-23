(ns reagent-material-ui.icons.view-sidebar
  "Imports @material-ui/icons/ViewSidebar as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-sidebar (create-svg-icon (e "path" #js {"d" "M16 20H2V4h14v16zm2-12h4V4h-4v4zm0 12h4v-4h-4v4zm0-6h4v-4h-4v4z"})
                                   "ViewSidebar"))
