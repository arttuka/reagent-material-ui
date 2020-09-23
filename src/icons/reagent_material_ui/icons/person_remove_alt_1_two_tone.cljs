(ns reagent-material-ui.icons.person-remove-alt-1-two-tone
  "Imports @material-ui/icons/PersonRemoveAlt1TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def person-remove-alt-1-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10 16c2.69 0 5.77 1.28 6 2H4c.2-.71 3.3-2 6-2z", "opacity" ".3"}) (e "circle" #js {"cy" "8", "r" "2", "cx" "10", "opacity" ".3"}) (e "path" #js {"d" "M14 8c0-2.21-1.79-4-4-4S6 5.79 6 8s1.79 4 4 4 4-1.79 4-4zm-2 0c0 1.1-.9 2-2 2s-2-.9-2-2 .9-2 2-2 2 .9 2 2zM2 18v2h16v-2c0-2.66-5.33-4-8-4s-8 1.34-8 4zm2 0c.2-.71 3.3-2 6-2 2.69 0 5.77 1.28 6 2H4zM17 10h6v2h-6z"}))
                                                   "PersonRemoveAlt1TwoTone"))
