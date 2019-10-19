(ns reagent-material-ui.icons.stop
  "Imports @material-ui/icons/Stop as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def stop (create-svg-icon (e "path" #js {"d" "M6 6h12v12H6z"})
                           "Stop"))
