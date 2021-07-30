(ns reagent-material-ui.icons.coffee-maker-sharp
  "Imports @material-ui/icons/CoffeeMakerSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def coffee-maker-sharp (create-svg-icon [(e "path" #js {"d" "M18 7V4h2V2H4v20h16v-2h-4.03c1.23-.91 2.03-2.36 2.03-4v-5H8v5c0 1.64.81 3.09 2.03 4H6V4h2v3h10z"}) (e "circle" #js {"cx" "13", "cy" "9", "r" "1"})]
                                         "CoffeeMakerSharp"))
