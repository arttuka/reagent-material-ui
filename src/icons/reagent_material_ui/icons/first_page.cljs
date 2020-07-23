(ns reagent-material-ui.icons.first-page
  "Imports @material-ui/icons/FirstPage as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def first-page (create-svg-icon (e "path" #js {"d" "M18.41 16.59L13.82 12l4.59-4.59L17 6l-6 6 6 6zM6 6h2v12H6z"})
                                 "FirstPage"))
