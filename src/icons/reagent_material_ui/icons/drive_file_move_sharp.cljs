(ns reagent-material-ui.icons.drive-file-move-sharp
  "Imports @material-ui/icons/DriveFileMoveSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def drive-file-move-sharp (create-svg-icon (e "path" #js {"d" "M22 6H12l-2-2H2v16h20V6zM12 17v-3H8v-2h4V9l4 4-4 4z"})
                                            "DriveFileMoveSharp"))
