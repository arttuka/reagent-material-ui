(ns reagent-material-ui.icons.arrow-forward-ios
  "Imports @material-ui/icons/ArrowForwardIos as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-forward-ios (create-svg-icon (e "path" #js {"d" "M5.88 4.12L13.76 12l-7.88 7.88L8 22l10-10L8 2z"})
                                        "ArrowForwardIos"))
