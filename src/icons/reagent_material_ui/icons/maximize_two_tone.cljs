(ns reagent-material-ui.icons.maximize-two-tone
  "Imports @material-ui/icons/MaximizeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def maximize-two-tone (create-svg-icon (e "path" #js {"d" "M3 3h18v2H3V3z"})
                                        "MaximizeTwoTone"))
