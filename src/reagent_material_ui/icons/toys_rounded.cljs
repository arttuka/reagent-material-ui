(ns reagent-material-ui.icons.toys-rounded
  "Imports @material-ui/icons/ToysRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def toys-rounded (create-svg-icon (e "path" #js {"d" "M12 12c0-3 2.5-5.5 5.5-5.5 2.57 0 4.77 1.83 5.35 4.24.15.64-.32 1.26-.97 1.26H12zm0 0c0 3-2.5 5.5-5.5 5.5-2.57 0-4.77-1.83-5.35-4.24-.15-.64.32-1.26.97-1.26H12zm0 0c-3 0-5.5-2.5-5.5-5.5 0-2.57 1.83-4.77 4.24-5.35.64-.15 1.26.32 1.26.97V12zm0 0c3 0 5.5 2.5 5.5 5.5 0 2.57-1.83 4.77-4.24 5.35-.64.15-1.26-.32-1.26-.97V12z"})
                                   "ToysRounded"))
