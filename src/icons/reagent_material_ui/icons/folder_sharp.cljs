(ns reagent-material-ui.icons.folder-sharp
  "Imports @material-ui/icons/FolderSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def folder-sharp (create-svg-icon (e "path" #js {"d" "M10 4H2v16h20V6H12l-2-2z"})
                                   "FolderSharp"))
