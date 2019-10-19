(ns reagent-material-ui.icons.phonelink-erase-sharp
  "Imports @material-ui/icons/PhonelinkEraseSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def phonelink-erase-sharp (create-svg-icon (e "path" #js {"d" "M13 8.2l-1-1-4 4-4-4-1 1 4 4-4 4 1 1 4-4 4 4 1-1-4-4 4-4zM21 1H7v5h2V4h10v16H9v-2H7v5h14V1z"})
                                            "PhonelinkEraseSharp"))
