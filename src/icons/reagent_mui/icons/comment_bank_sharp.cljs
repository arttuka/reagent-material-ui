(ns reagent-mui.icons.comment-bank-sharp
  "Imports @mui/icons-material/CommentBankSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def comment-bank-sharp (create-svg-icon (e "path" #js {"d" "M2 2v20l4-4h16V2H2zm17 11-2.5-1.5L14 13V5h5v8z"})
                                         "CommentBankSharp"))
