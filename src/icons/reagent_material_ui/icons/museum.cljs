(ns reagent-material-ui.icons.museum
  "Imports @material-ui/icons/Museum as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def museum (create-svg-icon (e "path" #js {"d" "M22 11V9L12 2 2 9v2h2v9H2v2h20v-2h-2v-9h2zm-6 7h-2v-4l-2 3-2-3v4H8v-7h2l2 3 2-3h2v7z"})
                             "Museum"))
