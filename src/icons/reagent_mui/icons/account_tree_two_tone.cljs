(ns reagent-mui.icons.account-tree-two-tone
  "Imports @mui/icons-material/AccountTreeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def account-tree-two-tone (create-svg-icon [(e "path" #js {"d" "M22 11V3h-7v3H9V3H2v8h7V8h2v10h4v3h7v-8h-7v3h-2V8h2v3h7zM7 9H4V5h3v4zm10 6h3v4h-3v-4zm0-10h3v4h-3V5z"}) (e "path" #js {"d" "M7 5v4H4V5h3m13 0v4h-3V5h3m0 10v4h-3v-4h3", "opacity" ".3"})]
                                            "AccountTreeTwoTone"))
