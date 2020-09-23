(ns reagent-material-ui.icons.filter-hdr
  "Imports @material-ui/icons/FilterHdr as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-hdr (create-svg-icon (e "path" #js {"d" "M14 6l-3.75 5 2.85 3.8-1.6 1.2C9.81 13.75 7 10 7 10l-6 8h22L14 6z"})
                                 "FilterHdr"))
