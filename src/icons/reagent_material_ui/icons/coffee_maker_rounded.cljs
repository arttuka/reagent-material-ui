(ns reagent-material-ui.icons.coffee-maker-rounded
  "Imports @material-ui/icons/CoffeeMakerRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def coffee-maker-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 6V4h1c.55 0 1-.45 1-1s-.45-1-1-1H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h13c.55 0 1-.45 1-1s-.45-1-1-1h-3.03c1.23-.91 2.03-2.36 2.03-4v-3c0-1.1-.9-2-2-2h-6c-1.1 0-2 .9-2 2v3c0 1.64.81 3.09 2.03 4H6V4h2v2c0 .55.45 1 1 1h8c.55 0 1-.45 1-1z"}) (e "circle" #js {"cy" "9", "r" "1", "cx" "13"}))
                                           "CoffeeMakerRounded"))
