(ns reagent-material-ui.icons.space-bar-outlined
  "Imports @material-ui/icons/SpaceBarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def space-bar-outlined (create-svg-icon (e "path" #js {"d" "M18 9v4H6V9H4v6h16V9h-2z"})
                                         "SpaceBarOutlined"))
