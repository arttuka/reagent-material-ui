(ns reagent-material-ui.icons.view-stream
  "Imports @material-ui/icons/ViewStream as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-stream (create-svg-icon (e "path" #js {"d" "M4 18h17v-6H4v6zM4 5v6h17V5H4z"})
                                  "ViewStream"))
