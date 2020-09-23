(ns reagent-material-ui.icons.add-to-home-screen
  "Imports @material-ui/icons/AddToHomeScreen as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-to-home-screen (create-svg-icon (e "path" #js {"d" "M18 1.01L8 1c-1.1 0-2 .9-2 2v3h2V5h10v14H8v-1H6v3c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM10 15h2V8H5v2h3.59L3 15.59 4.41 17 10 11.41z"})
                                         "AddToHomeScreen"))
