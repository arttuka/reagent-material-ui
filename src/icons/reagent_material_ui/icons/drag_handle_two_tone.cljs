(ns reagent-material-ui.icons.drag-handle-two-tone
  "Imports @material-ui/icons/DragHandleTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def drag-handle-two-tone (create-svg-icon (e "path" #js {"d" "M4 9h16v2H4zm0 4h16v2H4z"})
                                           "DragHandleTwoTone"))
