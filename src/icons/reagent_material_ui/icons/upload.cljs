(ns reagent-material-ui.icons.upload
  "Imports @material-ui/icons/Upload as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def upload (create-svg-icon (e "path" #js {"d" "M5 20h14v-2H5v2zm0-10h4v6h6v-6h4l-7-7-7 7z"})
                             "Upload"))
