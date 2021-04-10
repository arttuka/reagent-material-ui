(ns reagent-material-ui.icons.account-balance-two-tone
  "Imports @material-ui/icons/AccountBalanceTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def account-balance-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6.29 6l5.21-2.74L16.71 6z", "opacity" ".3"}) (e "path" #js {"d" "M6.5 10h-2v7h2v-7zm6 0h-2v7h2v-7zm8.5 9H2v2h19v-2zm-2.5-9h-2v7h2v-7zm-7-9L2 6v2h19V6l-9.5-5zM6.29 6l5.21-2.74L16.71 6H6.29z"}))
                                               "AccountBalanceTwoTone"))
