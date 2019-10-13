(ns reagent-material-ui.icons.account-balance-wallet-sharp
  "Imports @material-ui/icons/AccountBalanceWalletSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def account-balance-wallet-sharp (create-svg-icon (e "path" #js {"d" "M21 18v3H3V3h18v3H10v12h11zm-9-2h10V8H12v8zm4-2.5c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5z"})
                                                   "AccountBalanceWalletSharp"))
