(ns reagent-material-ui.icons.call-merge-two-tone
  "Imports @material-ui/icons/CallMergeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def call-merge-two-tone (create-svg-icon (e "path" #js {"d" "M16.997 20.41l-3.408-3.407 1.4-1.407 3.41 3.408zM5.59 19L7 20.41l6-6V8h3.5L12 3.5 7.5 8H11v5.59z"})
                                          "CallMergeTwoTone"))
