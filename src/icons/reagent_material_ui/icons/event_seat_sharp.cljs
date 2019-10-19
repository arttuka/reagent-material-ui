(ns reagent-material-ui.icons.event-seat-sharp
  "Imports @material-ui/icons/EventSeatSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def event-seat-sharp (create-svg-icon (e "path" #js {"d" "M4 21h3v-3h10v3h3v-6H4v6zm15-11h3v3h-3v-3zM2 10h3v3H2v-3zm15 3H7V5c0-1.1.9-2 2-2h6c1.1 0 2 .9 2 2v8z"})
                                       "EventSeatSharp"))
