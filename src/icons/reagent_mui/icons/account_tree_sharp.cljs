(ns reagent-mui.icons.account-tree-sharp
  "Imports @mui/icons-material/AccountTreeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def account-tree-sharp (create-svg-icon (e "path" #js {"d" "M22 11V3h-7v3H9V3H2v8h7V8h2v10h4v3h7v-8h-7v3h-2V8h2v3z"})
                                         "AccountTreeSharp"))
