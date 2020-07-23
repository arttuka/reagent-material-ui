(ns reagent-material-ui.icons.insert-drive-file
  "Imports @material-ui/icons/InsertDriveFile as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def insert-drive-file (create-svg-icon (e "path" #js {"d" "M6 2c-1.1 0-1.99.9-1.99 2L4 20c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2V8l-6-6H6zm7 7V3.5L18.5 9H13z"})
                                        "InsertDriveFile"))
