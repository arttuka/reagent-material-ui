(ns reagent-material-ui.icons.download
  "Imports @material-ui/icons/Download as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def download (create-svg-icon (e "path" #js {"d" "M5 20h14v-2H5v2zM19 9h-4V3H9v6H5l7 7 7-7z"})
                               "Download"))
