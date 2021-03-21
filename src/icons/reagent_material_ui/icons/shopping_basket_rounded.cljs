(ns reagent-material-ui.icons.shopping-basket-rounded
  "Imports @material-ui/icons/ShoppingBasketRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def shopping-basket-rounded (create-svg-icon (e "path" #js {"d" "M17.21 9l-4.39-6.56c-.4-.59-1.27-.59-1.66 0L6.77 9H2c-.66 0-1.14.63-.96 1.27l2.76 10c.12.43.51.73.96.73h14.5c.45 0 .85-.3.96-.74l2.74-10C23.14 9.63 22.66 9 22 9h-4.79zm-5.22-4.21L14.8 9H9.18l2.81-4.21zM12 17c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})
                                              "ShoppingBasketRounded"))
