(ns reagent-material-ui.icons.trip-origin
  "Imports @material-ui/icons/TripOrigin as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def trip-origin (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M2 12C2 6.48 6.48 2 12 2s10 4.48 10 10-4.48 10-10 10S2 17.52 2 12zm10 6c3.31 0 6-2.69 6-6s-2.69-6-6-6-6 2.69-6 6 2.69 6 6 6z"}) (e "path" #js {"d" "M0 0h24v24H0z", "fill" "none"}))
                                  "TripOrigin"))
