(ns reagent-material-ui.icons.local-parking-rounded
  "Imports @material-ui/icons/LocalParkingRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-parking-rounded (create-svg-icon (e "path" #js {"d" "M12.79 3H8c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2s2-.9 2-2v-4h3c3.57 0 6.42-3.13 5.95-6.79C18.56 5.19 15.84 3 12.79 3zm.41 8H10V7h3.2c1.1 0 2 .9 2 2s-.9 2-2 2z"})
                                            "LocalParkingRounded"))
