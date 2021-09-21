(ns reagent-mui.icons.note-rounded
  "Imports @mui/icons-material/NoteRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def note-rounded (create-svg-icon (e "path" #js {"d" "m21.41 9.41-4.83-4.83c-.37-.37-.88-.58-1.41-.58H4c-1.1 0-2 .9-2 2v12.01c0 1.1.89 1.99 1.99 1.99H20c1.1 0 2-.9 2-2v-7.17c0-.53-.21-1.04-.59-1.42zM15 5.5l5.5 5.5H16c-.55 0-1-.45-1-1V5.5z"})
                                   "NoteRounded"))
