(ns reagent-mui.icons.notes-sharp
  "Imports @mui/icons-material/NotesSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def notes-sharp (create-svg-icon (e "path" #js {"d" "M21 11.01 3 11v2h18zM3 16h12v2H3zM21 6H3v2.01L21 8z"})
                                  "NotesSharp"))
