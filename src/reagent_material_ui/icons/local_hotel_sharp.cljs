(ns reagent-material-ui.icons.local-hotel-sharp
  "Imports @material-ui/icons/LocalHotelSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-hotel-sharp (create-svg-icon (e "path" #js {"d" "M7 13c1.66 0 3-1.34 3-3S8.66 7 7 7s-3 1.34-3 3 1.34 3 3 3zm16-6H11v7H3V5H1v15h2v-3h18v3h2V7z"})
                                        "LocalHotelSharp"))
