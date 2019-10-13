(ns reagent-material-ui.icons.sort
  "Imports @material-ui/icons/Sort as a Reagent component."
  (:refer-clojure :exclude [sort])
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def sort (create-svg-icon (e "path" #js {"d" "M3 18h6v-2H3v2zM3 6v2h18V6H3zm0 7h12v-2H3v2z"})
                           "Sort"))
