(ns reagent-material-ui.icons.broken-image-sharp
  "Imports @material-ui/icons/BrokenImageSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def broken-image-sharp (create-svg-icon (e "path" #js {"d" "M21 3v8.59l-3-3.01-4 4.01-4-4-4 4-3-3.01V3h18zm-3 8.42l3 3.01V21H3v-8.58l3 2.99 4-4 4 4 4-3.99z"})
                                         "BrokenImageSharp"))
