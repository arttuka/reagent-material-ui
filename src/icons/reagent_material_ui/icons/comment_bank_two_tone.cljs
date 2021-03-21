(ns reagent-material-ui.icons.comment-bank-two-tone
  "Imports @material-ui/icons/CommentBankTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def comment-bank-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 18l2-2h14V4H4v14zm9-12h5v8l-2.5-1.5L13 14V6z", "opacity" ".3"}) (e "path" #js {"d" "M18 14V6h-5v8l2.5-1.5z"}) (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H6l-2 2V4h16v12z"}))
                                            "CommentBankTwoTone"))
