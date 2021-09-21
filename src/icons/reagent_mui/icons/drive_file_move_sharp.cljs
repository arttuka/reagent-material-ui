(ns reagent-mui.icons.drive-file-move-sharp
  "Imports @mui/icons-material/DriveFileMoveSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def drive-file-move-sharp (create-svg-icon (e "path" #js {"d" "M22 6H12l-2-2H2v16h20V6zM12 17v-3H8v-2h4V9l4 4-4 4z"})
                                            "DriveFileMoveSharp"))
