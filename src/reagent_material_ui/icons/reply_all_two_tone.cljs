(ns reagent-material-ui.icons.reply-all-two-tone
  "Imports @material-ui/icons/ReplyAllTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def reply-all-two-tone (create-svg-icon (e "path" #js {"d" "M7 8V5l-7 7 7 7v-3l-4-4 4-4zm6 1V5l-7 7 7 7v-4.1c5 0 8.5 1.6 11 5.1-1-5-4-10-11-11z"})
                                         "ReplyAllTwoTone"))
