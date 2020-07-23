(ns reagent-material-ui.icons.drag-handle-sharp
  "Imports @material-ui/icons/DragHandleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def drag-handle-sharp (create-svg-icon (e "path" #js {"d" "M20 9H4v2h16V9zM4 15h16v-2H4v2z"})
                                        "DragHandleSharp"))
