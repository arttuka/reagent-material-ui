(ns reagent-material-ui.icons.subscriptions-sharp
  "Imports @material-ui/icons/SubscriptionsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def subscriptions-sharp (create-svg-icon (e "path" #js {"d" "M20 8H4V6h16v2zm-2-6H6v2h12V2zm4 8v12H2V10h20zm-6 6-6-3.27v6.53L16 16z"})
                                          "SubscriptionsSharp"))
