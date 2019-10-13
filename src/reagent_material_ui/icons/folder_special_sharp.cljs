(ns reagent-material-ui.icons.folder-special-sharp
  "Imports @material-ui/icons/FolderSpecialSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def folder-special-sharp (create-svg-icon (e "path" #js {"d" "M22 6H12l-2-2H2v16h20V6zm-4.06 11L15 15.28 12.06 17l.78-3.33-2.59-2.24 3.41-.29L15 8l1.34 3.14 3.41.29-2.59 2.24.78 3.33z"})
                                           "FolderSpecialSharp"))
