(ns reagent-material-ui.icons.sports-golf-outlined
  "Imports @material-ui/icons/SportsGolfOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def sports-golf-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12 16c3.87 0 7-3.13 7-7s-3.13-7-7-7-7 3.13-7 7 3.13 7 7 7zm0-12c2.76 0 5 2.24 5 5s-2.24 5-5 5-5-2.24-5-5 2.24-5 5-5z"}) (e "circle" #js {"cy" "8", "r" "1", "cx" "10"}) (e "circle" #js {"cy" "8", "r" "1", "cx" "14"}) (e "circle" #js {"cy" "6", "r" "1", "cx" "12"}) (e "path" #js {"d" "M7 19h2c1.1 0 2 .9 2 2v1h2v-1c0-1.1.9-2 2-2h2v-2H7v2z"}))
                                           "SportsGolfOutlined"))
