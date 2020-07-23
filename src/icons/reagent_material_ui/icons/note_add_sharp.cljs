(ns reagent-material-ui.icons.note-add-sharp
  "Imports @material-ui/icons/NoteAddSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def note-add-sharp (create-svg-icon (e "path" #js {"d" "M14 2H4v20h16V8l-6-6zm2 14h-3v3h-2v-3H8v-2h3v-3h2v3h3v2zm-3-7V3.5L18.5 9H13z"})
                                     "NoteAddSharp"))
