(ns reagent-material-ui.icons.maximize
  "Imports @material-ui/icons/Maximize as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def maximize (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3z"})
                               "Maximize"))
