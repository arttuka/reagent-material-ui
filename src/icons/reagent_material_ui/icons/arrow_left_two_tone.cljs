(ns reagent-material-ui.icons.arrow-left-two-tone
  "Imports @material-ui/icons/ArrowLeftTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-left-two-tone (create-svg-icon (e "path" #js {"d" "M14 7l-5 5 5 5V7z"})
                                          "ArrowLeftTwoTone"))
