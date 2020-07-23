(ns reagent-material-ui.icons.insert-comment-sharp
  "Imports @material-ui/icons/InsertCommentSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def insert-comment-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v16h16l4 4V2zm-4 12H6v-2h12v2zm0-3H6V9h12v2zm0-3H6V6h12v2z"})
                                           "InsertCommentSharp"))
