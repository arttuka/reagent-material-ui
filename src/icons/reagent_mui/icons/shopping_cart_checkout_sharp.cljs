(ns reagent-mui.icons.shopping-cart-checkout-sharp
  "Imports @mui/icons-material/ShoppingCartCheckoutSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shopping-cart-checkout-sharp (create-svg-icon (e "path" #js {"d" "M7 18c-1.1 0-1.99.9-1.99 2S5.9 22 7 22s2-.9 2-2-.9-2-2-2zm10 0c-1.1 0-1.99.9-1.99 2s.89 2 1.99 2 2-.9 2-2-.9-2-2-2zm-8.9-5h8.66L21 4.96 19.25 4l-3.7 7H8.53L4.27 2H1v2h2l3.6 7.59L3.61 17H19v-2H7l1.1-2zM12 2l4 4-4 4-1.41-1.41L12.17 7H8V5h4.17l-1.59-1.59L12 2z"})
                                                   "ShoppingCartCheckoutSharp"))
