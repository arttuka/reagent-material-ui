(ns reagent-material-ui.icons.high-quality-sharp
  "Imports @material-ui/icons/HighQualitySharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def high-quality-sharp (create-svg-icon (e "path" #js {"d" "M21 4H3v16h18V4zM11 15H9.5v-2h-2v2H6V9h1.5v2.5h2V9H11v6zm7 0h-1.75v1.5h-1.5V15H13V9h5v6zm-3.5-1.5h2v-3h-2v3z"})
                                         "HighQualitySharp"))
