(ns reagent-material-ui.icons.file-download-done-sharp
  "Imports @material-ui/icons/FileDownloadDoneSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def file-download-done-sharp (create-svg-icon (e "path" #js {"d" "M20.13 5.41L18.72 4l-9.19 9.19-4.25-4.24-1.41 1.41 5.66 5.66zM5 18h14v2H5z"})
                                               "FileDownloadDoneSharp"))
