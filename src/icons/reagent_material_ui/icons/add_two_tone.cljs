(ns reagent-material-ui.icons.add-two-tone
  "Imports @material-ui/icons/AddTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-two-tone (create-svg-icon (e "path" #js {"d" "M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z"})
                                   "AddTwoTone"))
