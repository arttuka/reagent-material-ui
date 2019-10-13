(ns reagent-material-ui.icons.arrow-drop-down-outlined
  "Imports @material-ui/icons/ArrowDropDownOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-drop-down-outlined (create-svg-icon (e "path" #js {"d" "M7 10l5 5 5-5H7z"})
                                               "ArrowDropDownOutlined"))
