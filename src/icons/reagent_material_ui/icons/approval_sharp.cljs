(ns reagent-material-ui.icons.approval-sharp
  "Imports @material-ui/icons/ApprovalSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def approval-sharp (create-svg-icon (e "path" #js {"d" "M4 14v8h16v-8H4zm14 4H6v-2h12v2zM12 2C9.24 2 7 4.24 7 7l5 7 5-7c0-2.76-2.24-5-5-5z"})
                                     "ApprovalSharp"))
