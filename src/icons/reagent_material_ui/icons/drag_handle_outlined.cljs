(ns reagent-material-ui.icons.drag-handle-outlined
  "Imports @material-ui/icons/DragHandleOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def drag-handle-outlined (create-svg-icon (e "path" #js {"d" "M20 9H4v2h16V9zM4 15h16v-2H4v2z"})
                                           "DragHandleOutlined"))
