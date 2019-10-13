(ns reagent-material-ui.icons.chevron-right-two-tone
  "Imports @material-ui/icons/ChevronRightTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def chevron-right-two-tone (create-svg-icon (e "path" #js {"d" "M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6-6-6z"})
                                             "ChevronRightTwoTone"))
