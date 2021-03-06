(ns reagent-material-ui.icons.account-balance-wallet-rounded
  "Imports @material-ui/icons/AccountBalanceWalletRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def account-balance-wallet-rounded (create-svg-icon (e "path" #js {"d" "M10 16V8c0-1.1.89-2 2-2h9V5c0-1.1-.9-2-2-2H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2v-1h-9c-1.11 0-2-.9-2-2zm3-8c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h8c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1h-8zm3 5.5c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5z"})
                                                     "AccountBalanceWalletRounded"))
