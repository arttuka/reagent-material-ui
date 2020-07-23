(ns reagent-material-ui.icons.unarchive-sharp
  "Imports @material-ui/icons/UnarchiveSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def unarchive-sharp (create-svg-icon (e "path" #js {"d" "M18.71 3H5.29L3 5.79V21h18V5.79L18.71 3zM14 15v2h-4v-2H6.5L12 9.5l5.5 5.5H14zM5.12 5l.81-1h12l.94 1H5.12z"})
                                      "UnarchiveSharp"))
