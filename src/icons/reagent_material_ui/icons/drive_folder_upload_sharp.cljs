(ns reagent-material-ui.icons.drive-folder-upload-sharp
  "Imports @material-ui/icons/DriveFolderUploadSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def drive-folder-upload-sharp (create-svg-icon (e "path" #js {"d" "M22 6H12l-2-2H2v16h20V6zm-9 7v4h-2v-4H8l4.01-4L16 13h-3z"})
                                                "DriveFolderUploadSharp"))
