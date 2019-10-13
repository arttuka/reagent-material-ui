(ns reagent-material-ui.icons.first-page-rounded
  "Imports @material-ui/icons/FirstPageRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def first-page-rounded (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M24 0v24H0V0h24z", "fill" "none", "opacity" ".87"}) (e "path" #js {"d" "M17.7 15.89L13.82 12l3.89-3.89c.39-.39.39-1.02 0-1.41a.9959.9959 0 00-1.41 0l-4.59 4.59c-.39.39-.39 1.02 0 1.41l4.59 4.59c.39.39 1.02.39 1.41 0 .38-.38.38-1.02-.01-1.4zM7 6c.55 0 1 .45 1 1v10c0 .55-.45 1-1 1s-1-.45-1-1V7c0-.55.45-1 1-1z"}))
                                         "FirstPageRounded"))
