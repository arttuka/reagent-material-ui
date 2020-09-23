(ns reagent-material-ui.icons.insert-drive-file-outlined
  "Imports @material-ui/icons/InsertDriveFileOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def insert-drive-file-outlined (create-svg-icon (e "path" #js {"d" "M14 2H6c-1.1 0-1.99.9-1.99 2L4 20c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2V8l-6-6zM6 20V4h7v5h5v11H6z"})
                                                 "InsertDriveFileOutlined"))
