(ns reagent-material-ui.icons.check-outlined
  "Imports @material-ui/icons/CheckOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def check-outlined (create-svg-icon (e "path" #js {"d" "M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41L9 16.17z"})
                                     "CheckOutlined"))
