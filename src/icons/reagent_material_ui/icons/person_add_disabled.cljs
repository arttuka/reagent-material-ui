(ns reagent-material-ui.icons.person-add-disabled
  "Imports @material-ui/icons/PersonAddDisabled as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def person-add-disabled (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "8", "r" "4", "cx" "15"}) (e "path" #js {"d" "M23 20v-2c0-2.3-4.1-3.7-6.9-3.9l6 5.9h.9zm-11.6-5.5C9.2 15.1 7 16.3 7 18v2h9.9l4 4 1.3-1.3-21-20.9L0 3.1l4 4V10H1v2h3v3h2v-3h2.9l2.5 2.5zM6 10v-.9l.9.9H6z"}))
                                          "PersonAddDisabled"))
