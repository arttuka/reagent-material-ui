(ns reagent-material-ui.icons.flight-land
  "Imports @material-ui/icons/FlightLand as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def flight-land (create-svg-icon (e (.-Fragment js/React) nil (e "defs" nil (e "path" #js {"d" "M0 0h24v24H0V0z", "id" "a"})) (e "defs" nil (e "path" #js {"d" "M0 0h24v24H0V0z", "id" "c"})) (e "path" #js {"d" "M2.5 19h19v2h-19zm7.18-5.73l4.35 1.16 5.31 1.42c.8.21 1.62-.26 1.84-1.06.21-.8-.26-1.62-1.06-1.84l-5.31-1.42-2.76-9.02L10.12 2v8.28L5.15 8.95l-.93-2.32-1.45-.39v5.17l1.6.43 5.31 1.43z"}))
                                  "FlightLand"))
