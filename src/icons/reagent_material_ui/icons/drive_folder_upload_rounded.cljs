(ns reagent-material-ui.icons.drive-folder-upload-rounded
  "Imports @material-ui/icons/DriveFolderUploadRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def drive-folder-upload-rounded (create-svg-icon (e "path" #js {"d" "M20 6h-8l-1.41-1.41C10.21 4.21 9.7 4 9.17 4H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm-7 7v3c0 .55-.45 1-1 1s-1-.45-1-1v-3H9.21c-.45 0-.67-.54-.35-.85l2.8-2.79c.2-.2.51-.19.71 0l2.79 2.79c.3.31.08.85-.36.85H13z"})
                                                  "DriveFolderUploadRounded"))
