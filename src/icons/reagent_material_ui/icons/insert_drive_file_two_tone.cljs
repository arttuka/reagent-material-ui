(ns reagent-material-ui.icons.insert-drive-file-two-tone
  "Imports @material-ui/icons/InsertDriveFileTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def insert-drive-file-two-tone (create-svg-icon [(e "path" #js {"d" "M13 4H6v16h12V9h-5z", "opacity" ".3"}) (e "path" #js {"d" "m20 8-6-6H6c-1.1 0-1.99.9-1.99 2L4 20c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2V8zm-2 12H6V4h7v5h5v11z"})]
                                                 "InsertDriveFileTwoTone"))
