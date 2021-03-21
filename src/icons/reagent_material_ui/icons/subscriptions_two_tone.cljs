(ns reagent-material-ui.icons.subscriptions-two-tone
  "Imports @material-ui/icons/SubscriptionsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def subscriptions-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 20h16v-8H4v8zm6-7.27L16 16l-6 3.26v-6.53z", "opacity" ".3"}) (e "path" #js {"d" "M4 6h16v2H4zm2-4h12v2H6zm14 8H4c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2v-8c0-1.1-.9-2-2-2zm0 10H4v-8h16v8zm-10-7.27v6.53L16 16z"}))
                                             "SubscriptionsTwoTone"))
