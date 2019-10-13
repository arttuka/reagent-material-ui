(ns reagent-material-ui.icons.local-hospital-sharp
  "Imports @material-ui/icons/LocalHospitalSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-hospital-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3.01L3 21h18V3zm-3 11h-4v4h-4v-4H6v-4h4V6h4v4h4v4z"})
                                           "LocalHospitalSharp"))
