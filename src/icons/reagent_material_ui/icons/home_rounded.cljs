(ns reagent-material-ui.icons.home-rounded
  "Imports @material-ui/icons/HomeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def home-rounded (create-svg-icon (e "path" #js {"d" "M10.8 3.9l-6 4.5c-.5.38-.8.97-.8 1.6v9c0 1.1.9 2 2 2h4v-7h4v7h4c1.1 0 2-.9 2-2v-9c0-.63-.3-1.22-.8-1.6l-6-4.5c-.71-.53-1.69-.53-2.4 0z"})
                                   "HomeRounded"))
