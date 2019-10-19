(ns reagent-material-ui.icons.landscape-sharp
  "Imports @material-ui/icons/LandscapeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def landscape-sharp (create-svg-icon (e "path" #js {"d" "M14 6l-3.75 5 2.85 3.8-1.6 1.2C9.81 13.75 7 10 7 10l-6 8h22L14 6z"})
                                      "LandscapeSharp"))
