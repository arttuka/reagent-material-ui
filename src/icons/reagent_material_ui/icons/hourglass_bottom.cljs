(ns reagent-material-ui.icons.hourglass-bottom
  "Imports @material-ui/icons/HourglassBottom as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def hourglass-bottom (create-svg-icon (e "path" #js {"d" "M18 22l-.01-6L14 12l3.99-4.01L18 2H6v6l4 4-4 3.99V22h12zM8 7.5V4h8v3.5l-4 4-4-4z"})
                                       "HourglassBottom"))
