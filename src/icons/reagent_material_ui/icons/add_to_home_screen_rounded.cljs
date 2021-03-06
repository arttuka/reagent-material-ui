(ns reagent-material-ui.icons.add-to-home-screen-rounded
  "Imports @material-ui/icons/AddToHomeScreenRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-to-home-screen-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10.29 13.29c.63.63 1.71.18 1.71-.71V9c0-.55-.45-1-1-1H7.41c-.89 0-1.33 1.08-.7 1.71L7.8 10.8l-4.1 4.09c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l4.09-4.09 1.09 1.08z"}) (e "path" #js {"d" "M18 1H8c-1.1 0-2 .9-2 2v4h2V6h10v12H8v-1H6v4c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2z"}))
                                                 "AddToHomeScreenRounded"))
