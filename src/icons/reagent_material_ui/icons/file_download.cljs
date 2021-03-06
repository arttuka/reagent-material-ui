(ns reagent-material-ui.icons.file-download
  "Imports @material-ui/icons/FileDownload as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def file-download (create-svg-icon (e "path" #js {"d" "M19 9h-4V3H9v6H5l7 7 7-7zM5 18v2h14v-2H5z"})
                                    "FileDownload"))
