(ns reagent-material-ui.icons.people-alt-sharp
  "Imports @material-ui/icons/PeopleAltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def people-alt-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M16.67 13.13C18.04 14.06 19 15.32 19 17v3h4v-3c0-2.18-3.57-3.47-6.33-3.87z", "fillRule" "evenodd"}) (e "circle" #js {"cy" "8", "r" "4", "cx" "9", "fillRule" "evenodd"}) (e "path" #js {"d" "M15 12c2.21 0 4-1.79 4-4s-1.79-4-4-4c-.47 0-.91.1-1.33.24C14.5 5.27 15 6.58 15 8s-.5 2.73-1.33 3.76c.42.14.86.24 1.33.24zM9 13c-2.67 0-8 1.34-8 4v3h16v-3c0-2.66-5.33-4-8-4z", "fillRule" "evenodd"}))
                                       "PeopleAltSharp"))
