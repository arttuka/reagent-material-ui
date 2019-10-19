(ns reagent-material-ui.icons.stop-sharp
  "Imports @material-ui/icons/StopSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def stop-sharp (create-svg-icon (e "path" #js {"d" "M6 6h12v12H6V6z"})
                                 "StopSharp"))
