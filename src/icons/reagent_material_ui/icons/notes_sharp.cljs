(ns reagent-material-ui.icons.notes-sharp
  "Imports @material-ui/icons/NotesSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def notes-sharp (create-svg-icon (e "path" #js {"d" "M21 11.01L3 11v2h18zM3 16h12v2H3zM21 6H3v2.01L21 8z"})
                                  "NotesSharp"))
