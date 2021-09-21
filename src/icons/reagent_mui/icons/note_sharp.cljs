(ns reagent-mui.icons.note-sharp
  "Imports @mui/icons-material/NoteSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def note-sharp (create-svg-icon (e "path" #js {"d" "m22 10-6-6H2v16h20V10zm-7-4.5 5.5 5.5H15V5.5z"})
                                 "NoteSharp"))
