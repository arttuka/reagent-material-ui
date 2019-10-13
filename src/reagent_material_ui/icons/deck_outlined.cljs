(ns reagent-material-ui.icons.deck-outlined
  "Imports @material-ui/icons/DeckOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def deck-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M22 9L12 2 2 9h9v13h2V9h9zM12 4.44L15.66 7H8.34L12 4.44z"}) (e "path" #js {"d" "M4.14 12l-1.96.37.82 4.37V22h2l.02-4H7v4h2v-6H4.9zM19.1 16H15v6h2v-4h1.98l.02 4h2v-5.26l.82-4.37-1.96-.37z"}))
                                    "DeckOutlined"))
