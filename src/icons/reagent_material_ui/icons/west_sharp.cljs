(ns reagent-material-ui.icons.west-sharp
  "Imports @material-ui/icons/WestSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def west-sharp (create-svg-icon (e "path" #js {"d" "M9 19l1.41-1.41L5.83 13H22v-2H5.83l4.59-4.59L9 5l-7 7 7 7z"})
                                 "WestSharp"))
