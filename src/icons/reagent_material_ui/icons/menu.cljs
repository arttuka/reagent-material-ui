(ns reagent-material-ui.icons.menu
  "Imports @material-ui/icons/Menu as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def menu (create-svg-icon (e "path" #js {"d" "M3 18h18v-2H3v2zm0-5h18v-2H3v2zm0-7v2h18V6H3z"})
                           "Menu"))
