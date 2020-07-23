(ns reagent-material-ui.icons.add-comment-sharp
  "Imports @material-ui/icons/AddCommentSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-comment-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v16h16l4 4V2zm-5 9h-4v4h-2v-4H7V9h4V5h2v4h4v2z"})
                                        "AddCommentSharp"))
