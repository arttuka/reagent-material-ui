(ns reagent-mui.icons.note-add-sharp
  "Imports @mui/icons-material/NoteAddSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def note-add-sharp (create-svg-icon (e "path" #js {"d" "M14 2H4v20h16V8l-6-6zm2 14h-3v3h-2v-3H8v-2h3v-3h2v3h3v2zm-3-7V3.5L18.5 9H13z"})
                                     "NoteAddSharp"))
