(ns reagent-material-ui.icons.near-me
  "Imports @material-ui/icons/NearMe as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def near-me (create-svg-icon (e "path" #js {"d" "M21 3L3 10.53v.98l6.84 2.65L12.48 21h.98L21 3z"})
                              "NearMe"))
