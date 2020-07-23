(ns reagent-material-ui.icons.space-bar-two-tone
  "Imports @material-ui/icons/SpaceBarTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def space-bar-two-tone (create-svg-icon (e "path" #js {"d" "M18 13H6V9H4v6h16V9h-2z"})
                                         "SpaceBarTwoTone"))
