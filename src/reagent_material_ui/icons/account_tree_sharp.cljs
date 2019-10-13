(ns reagent-material-ui.icons.account-tree-sharp
  "Imports @material-ui/icons/AccountTreeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def account-tree-sharp (create-svg-icon (e "path" #js {"d" "M22 11V3h-7v3H9V3H2v8h7V8h2v10h4v3h7v-8h-7v3h-2V8h2v3z"})
                                         "AccountTreeSharp"))
