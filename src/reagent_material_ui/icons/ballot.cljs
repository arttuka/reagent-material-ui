(ns reagent-material-ui.icons.ballot
  "Imports @material-ui/icons/Ballot as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def ballot (create-svg-icon (e (.-Fragment js/React) nil (e "defs" nil (e "path" #js {"d" "M0 0h24v24H0z", "id" "a"})) (e "path" #js {"d" "M13 9.5h5v-2h-5v2zm0 7h5v-2h-5v2zm6 4.5H5c-1.1 0-2-.9-2-2V5c0-1.1.9-2 2-2h14c1.1 0 2 .9 2 2v14c0 1.1-.9 2-2 2zM6 11h5V6H6v5zm1-4h3v3H7V7zM6 18h5v-5H6v5zm1-4h3v3H7v-3z", "clipRule" "evenodd", "fillRule" "evenodd"}))
                             "Ballot"))
