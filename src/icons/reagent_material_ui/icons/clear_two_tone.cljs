(ns reagent-material-ui.icons.clear-two-tone
  "Imports @material-ui/icons/ClearTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def clear-two-tone (create-svg-icon (e "path" #js {"d" "M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12 19 6.41z"})
                                     "ClearTwoTone"))
