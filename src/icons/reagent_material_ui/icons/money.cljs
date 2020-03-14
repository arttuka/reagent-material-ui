(ns reagent-material-ui.icons.money
  "Imports @material-ui/icons/Money as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def money (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M5 8h2v8H5zm7 0H9c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h3c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1zm-1 6h-1v-4h1v4zm7-6h-3c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h3c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1zm-1 6h-1v-4h1v4z"}) (e "path" #js {"d" "M2 4v16h20V4H2zm2 14V6h16v12H4z"}))
                            "Money"))
