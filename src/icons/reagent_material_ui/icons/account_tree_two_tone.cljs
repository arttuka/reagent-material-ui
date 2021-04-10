(ns reagent-material-ui.icons.account-tree-two-tone
  "Imports @material-ui/icons/AccountTreeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def account-tree-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M22 11V3h-7v3H9V3H2v8h7V8h2v10h4v3h7v-8h-7v3h-2V8h2v3h7zM7 9H4V5h3v4zm10 6h3v4h-3v-4zm0-10h3v4h-3V5z"}) (e "path" #js {"d" "M7 5v4H4V5h3M20 5v4h-3V5h3M20 15v4h-3v-4h3", "opacity" ".3"}))
                                            "AccountTreeTwoTone"))
