(ns reagent-material-ui.icons.download-sharp
  "Imports @material-ui/icons/DownloadSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def download-sharp (create-svg-icon (e "path" #js {"d" "M19 9h-4V3H9v6H5l7 7 7-7zM5 18v2h14v-2H5z"})
                                     "DownloadSharp"))
