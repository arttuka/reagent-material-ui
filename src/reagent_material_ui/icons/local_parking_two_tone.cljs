(ns reagent-material-ui.icons.local-parking-two-tone
  "Imports @material-ui/icons/LocalParkingTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-parking-two-tone (create-svg-icon (e "path" #js {"d" "M13 3H6v18h4v-6h3c3.31 0 6-2.69 6-6s-2.69-6-6-6zm.2 8H10V7h3.2c1.1 0 2 .9 2 2s-.9 2-2 2z"})
                                             "LocalParkingTwoTone"))
