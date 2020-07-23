(ns reagent-material-ui.icons.save-alt-sharp
  "Imports @material-ui/icons/SaveAltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def save-alt-sharp (create-svg-icon (e "path" #js {"d" "M19 12v7H5v-7H3v9h18v-9h-2zm-6 .67l2.59-2.58L17 11.5l-5 5-5-5 1.41-1.41L11 12.67V3h2v9.67z"})
                                     "SaveAltSharp"))
