(ns reagent-material-ui.icons.account-balance
  "Imports @material-ui/icons/AccountBalance as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def account-balance (create-svg-icon (e "path" #js {"d" "M4 10h3v7H4zM10.5 10h3v7h-3zM2 19h20v3H2zM17 10h3v7h-3zM12 1L2 6v2h20V6z"})
                                      "AccountBalance"))
