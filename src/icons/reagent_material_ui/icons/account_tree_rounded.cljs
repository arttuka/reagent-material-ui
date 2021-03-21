(ns reagent-material-ui.icons.account-tree-rounded
  "Imports @material-ui/icons/AccountTreeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def account-tree-rounded (create-svg-icon (e "path" #js {"d" "M17 11h3c1.11 0 2-.9 2-2V5c0-1.1-.9-2-2-2h-3c-1.1 0-2 .9-2 2v1H9.01V5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v4c0 1.1.9 2 2 2h3c1.1 0 2-.9 2-2V8h2v8c0 1.1.9 2 2 2h2v1c0 1.11.9 2 2 2h3c1.11 0 2-.9 2-2v-4c0-1.1-.9-2-2-2h-3c-1.1 0-2 .9-2 2v1h-2V8h2v1c0 1.1.9 2 2 2z"})
                                           "AccountTreeRounded"))
