(ns reagent-material-ui.icons.emoji-people-sharp
  "Imports @material-ui/icons/EmojiPeopleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def emoji-people-sharp (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "4", "r" "2", "cx" "12"}) (e "path" #js {"d" "M15.89 8.11C15.5 7.72 14.83 7 13.53 7h-2.54C8.24 6.99 6 4.75 6 2H4c0 3.16 2.11 5.84 5 6.71V22h2v-6h2v6h2V10.05L18.95 14l1.41-1.41-4.47-4.48z"}))
                                         "EmojiPeopleSharp"))
