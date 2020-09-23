(ns reagent-material-ui.icons.arrow-drop-up-outlined
  "Imports @material-ui/icons/ArrowDropUpOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-drop-up-outlined (create-svg-icon (e "path" #js {"d" "M7 14l5-5 5 5H7z"})
                                             "ArrowDropUpOutlined"))
