(ns reagent-material-ui.icons.policy
  "Imports @material-ui/icons/Policy as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def policy (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M21 5l-9-4-9 4v6c0 5.55 3.84 10.74 9 12 2.3-.56 4.33-1.9 5.88-3.71l-3.12-3.12c-1.94 1.29-4.58 1.07-6.29-.64-1.95-1.95-1.95-5.12 0-7.07 1.95-1.95 5.12-1.95 7.07 0 1.71 1.71 1.92 4.35.64 6.29l2.9 2.9C20.29 15.69 21 13.38 21 11V5z"}) (e "circle" #js {"cy" "12", "r" "3", "cx" "12"}))
                             "Policy"))
