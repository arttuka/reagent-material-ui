(ns reagent-material-ui.icons.note-sharp
  "Imports @material-ui/icons/NoteSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def note-sharp (create-svg-icon (e "path" #js {"d" "M22 10l-6-6H2v16h20V10zm-7-4.5l5.5 5.5H15V5.5z"})
                                 "NoteSharp"))
