(ns reagent-material-ui.icons.drag-handle
  "Imports @material-ui/icons/DragHandle as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def drag-handle (create-svg-icon (e (.-Fragment js/React) nil (e "defs" nil (e "path" #js {"d" "M0 0h24v24H0V0z", "id" "a"})) (e "path" #js {"d" "M20 9H4v2h16V9zM4 15h16v-2H4v2z"}))
                                  "DragHandle"))
