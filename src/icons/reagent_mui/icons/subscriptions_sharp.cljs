(ns reagent-mui.icons.subscriptions-sharp
  "Imports @mui/icons-material/SubscriptionsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def subscriptions-sharp (create-svg-icon (e "path" #js {"d" "M20 8H4V6h16v2zm-2-6H6v2h12V2zm4 8v12H2V10h20zm-6 6-6-3.27v6.53L16 16z"})
                                          "SubscriptionsSharp"))
