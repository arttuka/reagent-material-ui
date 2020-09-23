(ns reagent-material-ui.icons.person-pin-sharp
  "Imports @material-ui/icons/PersonPinSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def person-pin-sharp (create-svg-icon (e "path" #js {"d" "M21 2H3v18h6l3 3 3-3h6V2zm-9 3.3c1.49 0 2.7 1.21 2.7 2.7s-1.21 2.7-2.7 2.7S9.3 9.49 9.3 8s1.21-2.7 2.7-2.7zM18 16H6v-.9c0-2 4-3.1 6-3.1s6 1.1 6 3.1v.9z"})
                                       "PersonPinSharp"))
