(ns reagent-material-ui.icons.navigation-two-tone
  "Imports @material-ui/icons/NavigationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def navigation-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M7.72 17.7l3.47-1.53.81-.36.81.36 3.47 1.53L12 7.27z", "opacity" ".3"}) (e "path" #js {"d" "M4.5 20.29l.71.71L12 18l6.79 3 .71-.71L12 2 4.5 20.29zm8.31-4.12l-.81-.36-.81.36-3.47 1.53L12 7.27l4.28 10.43-3.47-1.53z"}))
                                          "NavigationTwoTone"))
