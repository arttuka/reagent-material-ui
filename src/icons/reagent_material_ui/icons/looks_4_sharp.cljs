(ns reagent-material-ui.icons.looks-4-sharp
  "Imports @material-ui/icons/Looks4Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def looks-4-sharp (create-svg-icon (e "path" #js {"d" "M21.04 3h-18v18h18V3zm-6 14h-2v-4h-4V7h2v4h2V7h2v10z"})
                                    "Looks4Sharp"))
