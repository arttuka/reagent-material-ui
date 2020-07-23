(ns reagent-material-ui.icons.shop-two-sharp
  "Imports @material-ui/icons/ShopTwoSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def shop-two-sharp (create-svg-icon (e "path" #js {"d" "M3 9H1v13h18v-2H3V9zm15-4V3c0-1.1-.9-2-2-2h-4c-1.1 0-2 .9-2 2v2H5v13h18V5h-5zm-6-2h4v2h-4V3zm0 12V8l5.5 3-5.5 4z"})
                                     "ShopTwoSharp"))
