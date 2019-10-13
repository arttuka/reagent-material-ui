(ns reagent-material-ui.icons.expand-more-rounded
  "Imports @material-ui/icons/ExpandMoreRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def expand-more-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M24 24H0V0h24v24z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M15.88 9.29L12 13.17 8.12 9.29a.9959.9959 0 00-1.41 0c-.39.39-.39 1.02 0 1.41l4.59 4.59c.39.39 1.02.39 1.41 0l4.59-4.59c.39-.39.39-1.02 0-1.41-.39-.38-1.03-.39-1.42 0z"}))
                                          "ExpandMoreRounded"))
