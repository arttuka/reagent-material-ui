(ns reagent-material-ui.icons.comment-bank-rounded
  "Imports @material-ui/icons/CommentBankRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def comment-bank-rounded (create-svg-icon (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-1 11l-2.5-1.5L14 13V5h5v8z"})
                                           "CommentBankRounded"))
