(ns reagent-material-ui.icons.sports-baseball-sharp
  "Imports @material-ui/icons/SportsBaseballSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def sports-baseball-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M3.81 6.28C2.67 7.9 2 9.87 2 12s.67 4.1 1.81 5.72C6.23 16.95 8 14.68 8 12S6.23 7.05 3.81 6.28zM20.19 6.28C17.77 7.05 16 9.32 16 12s1.77 4.95 4.19 5.72C21.33 16.1 22 14.13 22 12s-.67-4.1-1.81-5.72z"}) (e "path" #js {"d" "M14 12c0-3.28 1.97-6.09 4.79-7.33C17.01 3.02 14.63 2 12 2S6.99 3.02 5.21 4.67C8.03 5.91 10 8.72 10 12s-1.97 6.09-4.79 7.33C6.99 20.98 9.37 22 12 22s5.01-1.02 6.79-2.67C15.97 18.09 14 15.28 14 12z"}))
                                            "SportsBaseballSharp"))
