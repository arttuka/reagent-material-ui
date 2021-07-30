(ns reagent-material-ui.icons.notes-two-tone
  "Imports @material-ui/icons/NotesTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def notes-two-tone (create-svg-icon (e "path" #js {"d" "M21 11.01 3 11v2h18zM3 16h12v2H3zM21 6H3v2.01L21 8z"})
                                     "NotesTwoTone"))
