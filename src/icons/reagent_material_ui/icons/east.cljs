(ns reagent-material-ui.icons.east
  "Imports @material-ui/icons/East as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def east (create-svg-icon (e "path" #js {"d" "M15 5l-1.41 1.41L18.17 11H2v2h16.17l-4.59 4.59L15 19l7-7-7-7z"})
                           "East"))
