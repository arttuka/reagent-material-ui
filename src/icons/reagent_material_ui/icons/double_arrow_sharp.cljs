(ns reagent-material-ui.icons.double-arrow-sharp
  "Imports @material-ui/icons/DoubleArrowSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def double-arrow-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.5 5H11l5 7-5 7h4.5l5-7z"}) (e "path" #js {"d" "M8.5 5H4l5 7-5 7h4.5l5-7z"}))
                                         "DoubleArrowSharp"))
