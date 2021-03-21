(ns reagent-material-ui.icons.folder-special-rounded
  "Imports @material-ui/icons/FolderSpecialRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def folder-special-rounded (create-svg-icon (e "path" #js {"d" "M20 6h-8l-1.41-1.41C10.21 4.21 9.7 4 9.17 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm-4.02 9.74l-1.07-.82-1.07.82c-.39.29-.92-.08-.78-.55l.42-1.36-1.2-.95c-.37-.28-.16-.88.31-.88H14l.43-1.34c.15-.46.8-.46.95 0l.44 1.34h1.41c.47 0 .68.6.31.89l-1.2.95.42 1.36c.15.46-.39.84-.78.54z"})
                                             "FolderSpecialRounded"))
