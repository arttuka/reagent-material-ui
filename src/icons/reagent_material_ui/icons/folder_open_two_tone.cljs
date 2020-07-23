(ns reagent-material-ui.icons.folder-open-two-tone
  "Imports @material-ui/icons/FolderOpenTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def folder-open-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 8h16v10H4z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-8l-2-2H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 12H4V8h16v10z"}))
                                           "FolderOpenTwoTone"))
