(ns reagent-material-ui.icons.north-outlined
  "Imports @material-ui/icons/NorthOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def north-outlined (create-svg-icon (e "path" #js {"d" "M5 9l1.41 1.41L11 5.83V22h2V5.83l4.59 4.59L19 9l-7-7-7 7z"})
                                     "NorthOutlined"))
