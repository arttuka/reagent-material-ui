(ns reagent-material-ui.icons.short-text
  "Imports @material-ui/icons/ShortText as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def short-text (create-svg-icon (e (.-Fragment js/React) nil (e "defs" nil (e "path" #js {"d" "M0 0h24v24H0V0z", "id" "a"})) (e "path" #js {"d" "M4 9h16v2H4zm0 4h10v2H4z"}))
                                 "ShortText"))
