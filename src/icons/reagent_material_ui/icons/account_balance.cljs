(ns reagent-material-ui.icons.account-balance
  "Imports @material-ui/icons/AccountBalance as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def account-balance (create-svg-icon (e "path" #js {"d" "M4 10h3v7H4zm6.5 0h3v7h-3zM2 19h20v3H2zm15-9h3v7h-3zm-5-9L2 6v2h20V6z"})
                                      "AccountBalance"))
