(ns reagent-material-ui.icons.food-bank-outlined
  "Imports @material-ui/icons/FoodBankOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def food-bank-outlined (create-svg-icon (e "path" #js {"d" "M12 5.5l6 4.5v9H6v-9l6-4.5M12 3L4 9v12h16V9l-8-6zm-.5 6.5v3H11v-3h-1v3h-.5v-3h-1v3c0 .83.67 1.5 1.5 1.5v4h1v-4c.83 0 1.5-.67 1.5-1.5v-3h-1zm1.5 2v3h1V18h1V9.5c-1.1 0-2 .9-2 2z"})
                                         "FoodBankOutlined"))
