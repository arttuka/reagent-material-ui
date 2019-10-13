(ns reagent-material-ui.icons.king-bed-sharp
  "Imports @material-ui/icons/KingBedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def king-bed-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M6 7h5v3H6zM13 7h5v3h-5z", "fill" "none"}) (e "path" #js {"d" "M20 10V5H4v5H2v7h1.33L4 19h1l.67-2h12.67l.66 2h1l.67-2H22v-7h-2zm-9 0H6V7h5v3zm7 0h-5V7h5v3z"}))
                                     "KingBedSharp"))
