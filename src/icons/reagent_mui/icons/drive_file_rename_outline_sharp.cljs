(ns reagent-mui.icons.drive-file-rename-outline-sharp
  "Imports @mui/icons-material/DriveFileRenameOutlineSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def drive-file-rename-outline-sharp (create-svg-icon (e "path" #js {"d" "m15 16-4 4h10v-4zm-2.94-8.81L3 16.25V20h3.75l9.06-9.06zm1.072-1.0673 2.5385-2.5386 3.7477 3.7477-2.5385 2.5385z"})
                                                      "DriveFileRenameOutlineSharp"))
