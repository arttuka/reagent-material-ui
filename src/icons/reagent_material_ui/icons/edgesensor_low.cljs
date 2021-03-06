(ns reagent-material-ui.icons.edgesensor-low
  "Imports @material-ui/icons/EdgesensorLow as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def edgesensor-low (create-svg-icon (e "path" #js {"d" "M2 7h2v7H2V7zm18 3h2v7h-2v-7zm-4-7.99L8 2c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V4c0-1.1-.9-1.99-2-1.99zM16 17H8V7h8v10z"})
                                     "EdgesensorLow"))
