(ns reagent-material-ui.icons.shopping-basket-sharp
  "Imports @material-ui/icons/ShoppingBasketSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def shopping-basket-sharp (create-svg-icon (e "path" #js {"d" "m17.21 9-4.39-6.57c-.4-.59-1.27-.59-1.66 0L6.77 9H.69L4 21h16.02l3.29-12h-6.1zm-5.22-4.21L14.8 9H9.18l2.81-4.21zM12 17c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})
                                            "ShoppingBasketSharp"))
