(ns reagent-material-ui.icons.account-balance-rounded
  "Imports @material-ui/icons/AccountBalanceRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def account-balance-rounded (create-svg-icon (e "path" #js {"d" "M5 11v5c0 .55.45 1 1 1s1-.45 1-1v-5c0-.55-.45-1-1-1s-1 .45-1 1zm6 0v5c0 .55.45 1 1 1s1-.45 1-1v-5c0-.55-.45-1-1-1s-1 .45-1 1zm10 8H3c-.55 0-1 .45-1 1s.45 1 1 1h18c.55 0 1-.45 1-1s-.45-1-1-1zm-4-8v5c0 .55.45 1 1 1s1-.45 1-1v-5c0-.55-.45-1-1-1s-1 .45-1 1zM3.24 8h17.53c1.31 0 1.71-1.76.55-2.34L12.9 1.45c-.56-.28-1.23-.28-1.79 0L2.68 5.66C1.52 6.24 1.94 8 3.24 8z"})
                                              "AccountBalanceRounded"))
