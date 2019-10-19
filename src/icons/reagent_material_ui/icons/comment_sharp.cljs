(ns reagent-material-ui.icons.comment-sharp
  "Imports @material-ui/icons/CommentSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def comment-sharp (create-svg-icon (e "path" #js {"d" "M21.99 2H2v16h16l4 4-.01-20zM18 14H6v-2h12v2zm0-3H6V9h12v2zm0-3H6V6h12v2z"})
                                    "CommentSharp"))
