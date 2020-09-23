(ns reagent-material-ui.icons.view-week-outlined
  "Imports @material-ui/icons/ViewWeekOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-week-outlined (create-svg-icon (e "path" #js {"d" "M21 4H3c-.55 0-1 .45-1 1v14c0 .55.45 1 1 1h18c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1zM8 18H4V6h4v12zm6 0h-4V6h4v12zm6 0h-4V6h4v12z"})
                                         "ViewWeekOutlined"))
