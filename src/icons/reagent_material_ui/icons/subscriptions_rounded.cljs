(ns reagent-material-ui.icons.subscriptions-rounded
  "Imports @material-ui/icons/SubscriptionsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def subscriptions-rounded (create-svg-icon (e "path" #js {"d" "M19 8H5c-.55 0-1-.45-1-1s.45-1 1-1h14c.55 0 1 .45 1 1s-.45 1-1 1zm-2-6H7c-.55 0-1 .45-1 1s.45 1 1 1h10c.55 0 1-.45 1-1s-.45-1-1-1zm5 10v8c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2v-8c0-1.1.9-2 2-2h16c1.1 0 2 .9 2 2zm-6.81 3.56L10 12.73v6.53l5.19-2.82c.35-.19.35-.69 0-.88z"})
                                            "SubscriptionsRounded"))
