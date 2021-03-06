(ns reagent-material-ui.icons.file-download-done-rounded
  "Imports @material-ui/icons/FileDownloadDoneRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def file-download-done-rounded (create-svg-icon (e "path" #js {"d" "M19.42 4.71a.9959.9959 0 0 0-1.41 0L9.53 13.2 5.99 9.66a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l4.24 4.24c.39.39 1.02.39 1.41 0l9.19-9.19c.4-.39.4-1.02 0-1.41zM6 20h12c.55 0 1-.45 1-1s-.45-1-1-1H6c-.55 0-1 .45-1 1s.45 1 1 1z"})
                                                 "FileDownloadDoneRounded"))
