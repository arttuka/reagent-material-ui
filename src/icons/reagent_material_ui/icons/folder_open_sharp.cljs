(ns reagent-material-ui.icons.folder-open-sharp
  "Imports @material-ui/icons/FolderOpenSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def folder-open-sharp (create-svg-icon (e "path" #js {"d" "M22 6H12l-2-2H2v16h20V6zm-2 12H4V8h16v10z"})
                                        "FolderOpenSharp"))
