(ns reagent-material-ui.icons.label-off
  "Imports @material-ui/icons/LabelOff as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def label-off (create-svg-icon (e "path" #js {"d" "M3.25 2.75l17 17L19 21l-2-2H5c-1.1 0-2-.9-2-2V7c0-.55.23-1.05.59-1.41L2 4l1.25-1.25zM22 12l-4.37-6.16C17.27 5.33 16.67 5 16 5H8l11 11 3-4z"})
                                "LabelOff"))
