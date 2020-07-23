(ns reagent-material-ui.icons.create-new-folder-sharp
  "Imports @material-ui/icons/CreateNewFolderSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def create-new-folder-sharp (create-svg-icon (e "path" #js {"d" "M22 6H12l-2-2H2v16h20V6zm-3 8h-3v3h-2v-3h-3v-2h3V9h2v3h3v2z"})
                                              "CreateNewFolderSharp"))
