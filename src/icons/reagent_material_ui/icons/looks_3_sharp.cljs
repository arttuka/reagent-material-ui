(ns reagent-material-ui.icons.looks-3-sharp
  "Imports @material-ui/icons/Looks3Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-3-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3.01v18H21V3zm-5.99 14H9v-2h4v-2h-2v-2h2V9H9V7h6.01v10z"})
                                    "Looks3Sharp"))
