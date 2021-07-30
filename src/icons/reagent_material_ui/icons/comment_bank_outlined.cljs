(ns reagent-material-ui.icons.comment-bank-outlined
  "Imports @material-ui/icons/CommentBankOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def comment-bank-outlined (create-svg-icon [(e "path" #js {"d" "M18 14V6h-5v8l2.5-1.5z"}) (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 14H6l-2 2V4h16v12z"})]
                                            "CommentBankOutlined"))
