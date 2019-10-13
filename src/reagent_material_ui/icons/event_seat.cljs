(ns reagent-material-ui.icons.event-seat
  "Imports @material-ui/icons/EventSeat as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def event-seat (create-svg-icon (e (.-Fragment js/React) nil (e "defs" nil (e "path" #js {"d" "M0 0h24v24H0V0z", "id" "a"})) (e "path" #js {"d" "M4 18v3h3v-3h10v3h3v-6H4zm15-8h3v3h-3zM2 10h3v3H2zm15 3H7V5c0-1.1.9-2 2-2h6c1.1 0 2 .9 2 2v8z"}))
                                 "EventSeat"))
