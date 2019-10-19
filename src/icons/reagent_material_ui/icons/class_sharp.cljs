(ns reagent-material-ui.icons.class-sharp
  "Imports @material-ui/icons/ClassSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def class-sharp (create-svg-icon (e "path" #js {"d" "M20 2H4v20h16V2zM6 4h5v8l-2.5-1.5L6 12V4z"})
                                  "ClassSharp"))
