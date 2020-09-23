(ns reagent-material-ui.icons.check-box-sharp
  "Imports @material-ui/icons/CheckBoxSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def check-box-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM10 17l-5-5 1.41-1.41L10 14.17l7.59-7.59L19 8l-9 9z"})
                                      "CheckBoxSharp"))
